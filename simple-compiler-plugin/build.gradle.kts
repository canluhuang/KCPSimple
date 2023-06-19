plugins {
    id("org.jetbrains.kotlin.jvm")
    id("maven-publish")
    id("java-gradle-plugin")
    kotlin("kapt")
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.8.20")
    compileOnly(kotlin("compiler-embeddable"))
    compileOnly("com.google.auto.service:auto-service:1.0.1")
    kapt("com.google.auto.service:auto-service:1.0.1")
}

group = "com.kmm.compiler"
version = "1.0"

publishing {
    publications {
        create<MavenPublication>("maven") {
            artifactId = "simple-compiler-plugin"
            from(components["java"])
        }
    }
}