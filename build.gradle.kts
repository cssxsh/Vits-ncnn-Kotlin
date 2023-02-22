plugins {
    kotlin("jvm") version "1.7.22"
    kotlin("plugin.serialization") version "1.7.22"
    id("me.him188.maven-central-publish") version "1.0.0-dev-3"
}

group = "xyz.cssxsh.vits"
version = "0.1.0"

mavenCentralPublish {
    useCentralS01()
    singleDevGithubProject("cssxsh", "Vits-ncnn-Kotlin")
    licenseFromGitHubProject("MIT")
    workingDir = System.getenv("PUBLICATION_TEMP")?.let { file(it).resolve(projectName) }
        ?: buildDir.resolve("publishing-tmp")
}

repositories {
    mavenLocal()
    mavenCentral()
}

dependencies {
    implementation("com.belerweb:pinyin4j:2.5.1")
    testImplementation(kotlin("test"))
}

kotlin {
    explicitApi()
}

tasks {
    test {
        useJUnitPlatform()
    }
}