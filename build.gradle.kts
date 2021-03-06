import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.3.30"
}
dependencies {
    implementation(kotlin("stdlib-jdk8"))
    compile("com.squareup:javapoet:1.11.1")
    compile(group = "io.github.cottonmc", name = "json-factory", version = "0.4.1")
    compile(group = "com.google.code.gson", name = "gson", version = "2.8.5")
}

repositories {
    mavenCentral()
    mavenLocal()
    maven {
        this.setUrl("http://server.bbkr.space:8081/artifactory/libs-release")
        name = "cotton"
    }
}

val compileKotlin: KotlinCompile by tasks
compileKotlin.kotlinOptions {
    jvmTarget = "1.8"
}

val compileTestKotlin: KotlinCompile by tasks
compileTestKotlin.kotlinOptions {
    jvmTarget = "1.8"
}

dependencies {
    compile(group = "io.github.cottonmc", name = "generationCommons", version = "1.0.0")
}