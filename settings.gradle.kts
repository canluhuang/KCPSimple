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

rootProject.name = "KCPSimple"
include(":androidApp")
include(":shared")
include(":simple-gradle-plugin")
include(":simple-compiler-plugin")
include(":simple-module")
