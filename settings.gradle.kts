enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "KursovikKMP"
include(":androidApp")
include(":shared")
include(":shared:core")
include(":shared:news")
include(":shared:favorites")
include(":shared:fridge")
include(":shared:home")
include(":shared:profile")
include(":shared:recipe")
include(":androidApp:core")
include(":androidApp:feature_news")
include(":androidApp:feature_favorites")
include(":androidApp:feature_auth")
