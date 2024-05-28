val querydslVersion: String = "5.1.0"

dependencies {
    // import common modules
    implementation(project(":common"))

    implementation("org.springframework.boot:spring-boot-starter-batch")

    // JPA
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")

    // Query DSL
    implementation("com.querydsl:querydsl-jpa:$querydslVersion:jakarta")
    kapt("com.querydsl:querydsl-apt:$querydslVersion:jakarta")
    kapt("jakarta.annotation:jakarta.annotation-api")
    kapt("jakarta.persistence:jakarta.persistence-api")

    runtimeOnly("com.mysql:mysql-connector-j")

    // Redis
    implementation("org.springframework.boot:spring-boot-starter-data-redis")
}

// sourceSets["main"].java.srcDir("src/main/generated")

tasks {
    named<Delete>("clean") {
        delete("src/main/generated")
    }
}
