plugins {
    kotlin("jvm") version "1.5.31"
    id("org.jlleitschuh.gradle.ktlint") version "10.2.0"

    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("bom"))
    implementation(kotlin("stdlib-jdk8"))

    testImplementation(kotlin("test"))
    testImplementation(kotlin("test-junit"))
}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(8))
}

application {
    mainClass.set("net.oxspring.mdk.cli.AppKt")
}
