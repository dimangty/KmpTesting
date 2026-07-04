import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidLibrary)
    alias(libs.plugins.serialization)
}

kotlin {
    androidTarget {
        compilerOptions {
            jvmTarget.set(JvmTarget.JVM_11)
        }
    }
    listOf(iosX64(), iosArm64(), iosSimulatorArm64()).forEach {
        it.binaries.framework { baseName = "news-data"; isStatic = true }
    }
    sourceSets {
        commonMain.dependencies {
            implementation(project(":core:common"))
            implementation(project(":core:network"))
            implementation(project(":core:remoteresult"))
            implementation(project(":feature:favorites:favorites-domain"))
            implementation(project(":feature:news:news-domain"))
            implementation(libs.koin.core)
            implementation(libs.kotlinx.coroutines.core)
        }
    }
}

android {
    namespace = "com.example.kursovikkmp.news.data"
    compileSdk = libs.versions.android.compileSdk.get().toInt()
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    defaultConfig { minSdk = libs.versions.android.minSdk.get().toInt() }
}
