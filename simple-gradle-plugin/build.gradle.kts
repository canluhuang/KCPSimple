plugins {
    id("org.jetbrains.kotlin.jvm")
    id("maven-publish")
    id("java-gradle-plugin")
    kotlin("kapt")
}

group = "com.kmm.gradle"
version = "1.0"

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["java"])
        }
    }
}

gradlePlugin {
    plugins {
        create("simpleGradlePlugin") {
            id = "simple-gradle-plugin"
            displayName = "Simple compiler plugin"
            description = "Example Plugin using IR to modify accessor of a class (KMP)"
            implementationClass = "com.kmm.gradle.SimpleGradlePlugin"
        }
    }
}

repositories {
    google()
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.8.20")
    implementation(gradleApi())
    implementation(gradleKotlinDsl())
    compileOnly(kotlin("compiler-embeddable"))
    implementation(kotlin("gradle-plugin"))

    compileOnly("com.google.auto.service:auto-service:1.0.1")
    kapt("com.google.auto.service:auto-service:1.0.1")
}