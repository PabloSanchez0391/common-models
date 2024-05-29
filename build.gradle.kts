plugins {
    id("java")
    id("maven-publish")
    id("com.google.cloud.artifactregistry.gradle-plugin") version "2.2.0"
//    id("com.google.gms.google-services")
}

group = "com.pasanmidev.skyroutes.models"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven(url="artifactregistry://europe-west2-maven.pkg.dev/skyroutes-c9b06/skyroutes")
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    compileOnly("org.projectlombok:lombok:1.18.32")
    annotationProcessor("org.projectlombok:lombok:1.18.32")

    implementation("com.google.code.gson:gson:2.11.0")
    implementation("org.jetbrains:annotations:24.1.0")

    implementation("com.google.firebase:firebase-admin:9.3.0")

    //implementation("com.google.android.gms:play-services-maps:18.2.0")

}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "com.pasanmidev.skyroutes.models"
            artifactId = "common-models"
            version = "1.0.4-SNAPSHOT"

            from(components["java"])
        }
    }
    repositories {
        maven (url="artifactregistry://europe-west2-maven.pkg.dev/skyroutes-c9b06/skyroutes")
    }
}

tasks.test {
    useJUnitPlatform()
}