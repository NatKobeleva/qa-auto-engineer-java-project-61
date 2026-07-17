plugins {
    id("com.github.ben-manes.versions")  version "0.52.0"
    id("org.sonarqube") version "7.3.1.8318"
    id("checkstyle")
    application
}

group = "hexlet.code"
version = "1.0-SNAPSHOT"

application {
    mainClass.set("hexlet.code.App")
}

repositories {
    mavenCentral()
}

checkstyle {
    configFile = file("config/checkstyle/checkstyle.xml")
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:6.0.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

sonar {
    properties {
        property("sonar.projectKey", "NatKobeleva_qa-auto-engineer-java-project-61")
        property("sonar.organization", "natkobeleva")
    }
}

tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}

tasks.test {
    useJUnitPlatform()
}