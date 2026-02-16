import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.compose.ExperimentalComposeLibrary

plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidLibrary)
    alias(libs.plugins.jetbrainsCompose)
    alias(libs.plugins.compose.compiler)
    alias(libs.plugins.serialization)
    alias(libs.plugins.sqldelight)
    id("dev.icerock.mobile.multiplatform-resources")
}

@OptIn(ExperimentalComposeLibrary::class)
kotlin {
    androidTarget {
        compilations.all {
            compileTaskProvider.configure {
                compilerOptions {
                    jvmTarget.set(JvmTarget.JVM_1_8)
                }
            }
        }
    }

    val iosTargets = mutableListOf(
        iosArm64(),
        iosSimulatorArm64()
    )

    // Only include iosX64 on non-ARM64 Macs (Intel Macs)
    // Use sysctl to detect actual hardware architecture (bypasses Rosetta translation)
    val isArm64Mac = try {
        val process = Runtime.getRuntime().exec(arrayOf("sysctl", "-n", "hw.optional.arm64"))
        val result = process.inputStream.bufferedReader().readText().trim()
        process.waitFor()
        result == "1"
    } catch (e: Exception) {
        false
    }

    if (!isArm64Mac) {
        iosTargets.add(iosX64())
    }

    iosTargets.forEach {
        it.binaries.framework {
            baseName = "shared"
            isStatic = false
            export("dev.icerock.moko:resources:0.25.1")
            export("dev.icerock.moko:graphics:0.10.0")
        }
    }

    sourceSets {
        commonMain.dependencies {
            //put your multiplatform dependencies here
            //implementation(libs.kotlin.coroutines)
            //Sqldelight
            implementation(libs.sqldelight.coroutines.extensions)

            //Moko
            api(libs.moko.resources)
            api(libs.moko.resources.compose)

            //Network
            implementation(libs.ktor.client.core)
            //implementation(libs.ktor.client.cio)
            implementation(libs.ktor.client.logging)
            implementation(libs.ktor.client.negotiation)
            implementation(libs.ktor.serialization.kotlinx.json)
            implementation(libs.kotlinx.serialization.core)
            implementation(libs.koin.core)
            api(libs.moko.resources)

            //
            implementation(libs.androidx.lifecycle.viewmodel)

            //Datetime
            implementation(libs.datetime)

            //Logs
            api(libs.napier)

            implementation(libs.touchLab)

            //Compose Multiplatform
            implementation(compose.runtime)
            implementation(compose.foundation)
            implementation(compose.material3)
            implementation(compose.materialIconsExtended)
            implementation(compose.ui)
            implementation(compose.components.resources)

            //Voyager Navigation
            implementation(libs.voyager.navigator)
            implementation(libs.voyager.transitions)
            implementation(libs.voyager.koin)
            implementation(libs.voyager.tab.navigator)

            //Kamel Image Loading
            implementation(libs.kamel.image)

            //Koin Compose
            api(libs.koin.compose)
        }
        commonTest.dependencies {
            implementation(libs.kotlin.test)
            implementation(libs.kotlin.coroutines.test)
            implementation(libs.turbine)
            implementation(compose.uiTest)
        }
        androidMain.dependencies {
            implementation(libs.koin.android)
            implementation(libs.ktor.client.okhttp)
            implementation(libs.androidx.navigation.compose)
            implementation(libs.sqldelight.android.driver)
            implementation(libs.compose.ui.tooling.preview.multiplatform)
        }

        iosMain.dependencies {
            implementation(libs.ktor.client.ios)
            implementation(libs.sqldelight.native.driver)
        }
    }
}

multiplatformResources {
    resourcesPackage.set("com.example.kursovikkmp")
}

android {
    namespace = "com.example.kursovikkmp"
    compileSdk = 35
    defaultConfig {
        minSdk = 28
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

sqldelight {
    databases {
        create("Database") {
            packageName.set("com.example.kursovikkmp")
            generateAsync.set(true)
        }
    }
    linkSqlite = true
}

