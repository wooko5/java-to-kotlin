import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    // 코틀린 플러그인
    kotlin("jvm") version "1.9.10" // 사용하고자 하는 코틀린 버전
    kotlin("plugin.spring") version "1.9.10" // 스프링과 함께 사용하기 위한 코틀린 플러그인
    kotlin("plugin.jpa") version "1.9.10" // JPA 사용 시 필요한 코틀린 플러그인

    // 스프링 부트 플러그인
    id("org.springframework.boot") version "3.1.2" // 스프링부트 사용 시 필요한 플러그인
    id("io.spring.dependency-management") version "1.1.3" // 의존성 관리
}

group = "com.example"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_17 // 자바 17 버전 사용

repositories {
    mavenCentral() // 의존성 중앙 저장소
}

dependencies {
    // 스프링 부트 의존성
    implementation("org.springframework.boot:spring-boot-starter-web") // 스프링 웹 MVC 의존성
    implementation("org.springframework.boot:spring-boot-starter-data-jpa") // 스프링 JPA 의존성
//    implementation("org.springframework.boot:spring-boot-starter-security") // 스프링 시큐리티 (선택)

    // 코틀린 관련 의존성
    implementation("org.jetbrains.kotlin:kotlin-reflect") // 코틀린 리플렉션
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8") // 코틀린 표준 라이브러리

    // 데이터베이스 드라이버 (MySQL 예시)
    runtimeOnly("com.mysql:mysql-connector-j") // MySQL을 사용하는 경우 데이터베이스 드라이버

    // 테스트 의존성
    testImplementation("org.springframework.boot:spring-boot-starter-test") // 테스트 의존성
    testImplementation("org.jetbrains.kotlin:kotlin-test") // 코틀린 테스트
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit5") // JUnit5를 사용하는 코틀린 테스트
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict") // 코틀린 null-safety 관련 설정
        jvmTarget = "17" // 자바 17을 타겟으로 컴파일
    }
}

tasks.getByName<org.springframework.boot.gradle.tasks.bundling.BootJar>("bootJar") {
    mainClass.set("com.kotlin.KotlinJavaSpringApplication") // 패키지 경로를 실제 경로로 변경
}

tasks.withType<Test> {
    useJUnitPlatform() // JUnit 플랫폼 사용
}
