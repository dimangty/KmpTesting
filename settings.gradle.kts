rootProject.name = "KursovikKMP"
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

pluginManagement {
    repositories {
        google {
            mavenContent {
                includeGroupAndSubgroups("androidx")
                includeGroupAndSubgroups("com.android")
                includeGroupAndSubgroups("com.google")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositories {
        google {
            mavenContent {
                includeGroupAndSubgroups("androidx")
                includeGroupAndSubgroups("com.android")
                includeGroupAndSubgroups("com.google")
            }
        }
        mavenCentral()
    }
}

include(":composeApp")

include(":core:common")
include(":core:database")
include(":core:mvvm")
include(":core:navigation")
include(":core:network")
include(":core:remoteresult")
include(":core:uikit")
include(":core:settings")
include(":core:memorycache")
include(":core:domain")
include(":core:validation")

include(":feature:main")
include(":feature:auth:auth-data")
include(":feature:auth:auth-domain")
include(":feature:auth:auth-ui")
include(":feature:news:news-data")
include(":feature:news:news-domain")
include(":feature:news:news-ui")
include(":feature:favorites:favorites-data")
include(":feature:favorites:favorites-domain")
include(":feature:favorites:favorites-ui")
