import org.springframework.boot.gradle.tasks.bundling.BootJar

dependencies {
    implementation("ch.hsr:geohash:1.4.0")
}

tasks.withType<Jar> {
    enabled = true
}

tasks.withType<BootJar> {
    enabled = false
}
