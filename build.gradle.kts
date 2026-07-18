plugins {
    `java-library`
}

group = "org.powernukkitx"
version = "1.0.0"

java.sourceCompatibility = JavaVersion.VERSION_21
java.targetCompatibility = JavaVersion.VERSION_21

repositories {
    mavenLocal()
    mavenCentral()
    maven("https://repo.powernukkitx.org/releases")
    maven("https://repo.opencollab.dev/releases")
    maven("https://repo.opencollab.dev/snapshots")
}

dependencies {
    compileOnly("org.powernukkitx:server:nightly-SNAPSHOT")
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
}

tasks.jar {
    archiveFileName.set("PNX-Waterdog-${project.version}.jar")
}
