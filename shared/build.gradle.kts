import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidLibrary)
    alias(libs.plugins.serialization)
    alias(libs.plugins.sqldelight)
}

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

    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    ).forEach {
        it.binaries.framework {
            baseName = "shared"
            isStatic = false
            export(projects.shared.core)
            export(projects.shared.news)
            export(projects.shared.favorites)
            export(projects.shared.fridge)
            export(projects.shared.home)
            export(projects.shared.profile)
            export(projects.shared.recipe)
            export("dev.icerock.moko:resources:0.26.0")
            export("dev.icerock.moko:graphics:0.10.0")
        }
    }

    sourceSets {
        commonMain.dependencies {
            api(projects.shared.core)
            api(projects.shared.news)
            api(projects.shared.favorites)
            api(projects.shared.fridge)
            api(projects.shared.home)
            api(projects.shared.profile)
            api(projects.shared.recipe)
        }
        commonTest.dependencies {
            implementation(libs.kotlin.test)
            implementation(libs.kotlin.coroutines.test)
            implementation(libs.turbine)
        }
        androidMain.dependencies {
            implementation(libs.koin.android)
            implementation(libs.androidx.navigation.compose)
        }
    }
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
    linkSqlite = true
}
