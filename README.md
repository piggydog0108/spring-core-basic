# Spring Core Study

Spring 핵심 기술에 관련한 학습을 위한 프로젝트이다.

본 글은 인프런 김영한 님의 강의를 듣고 정리 및, 복습용도로서 작성된 글이다.

김영한님 강의 URL : https://www.inflearn.com/course/%EC%8A%A4%ED%94%84%EB%A7%81-%ED%95%B5%EC%8B%AC-%EC%9B%90%EB%A6%AC-%EA%B8%B0%EB%B3%B8%ED%8E%B8

# 1. Project 생성
    
* Build Tool : Gradle
* Spring Boot : 2.4.x
* Language : Java
* Packageing : Jar
* grouId : hello
* artifactId : core

<https://start.spring.io/> 에서 위와 같이 설정 후,  build.gradle파일을 보면 아래와 같이 설정되어 있다.

 ###Build.Gradle
```
plugins {
	id 'org.springframework.boot' version '2.3.9.RELEASE'
	id 'io.spring.dependency-management' version '1.0.11.RELEASE'
	id 'java'
}

group = 'com.hello'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'

repositories {
	mavenCentral()
}

dependencies {
	implementation 'org.springframework.boot:spring-boot-starter'
	testImplementation('org.springframework.boot:spring-boot-starter-test') {
		exclude group: 'org.junit.vintage', module: 'junit-vintage-engine'
	}
}

test {
	useJUnitPlatform()
}
```
# 2. 요구사항

* 회원
    * 회원 가입 기능
    * 회원 조회 기능
      * 회원등급 General, VIP
    * 회원 관련 DB는 현재 미정
    
* 주문, 할일
    * 회원은 상품 주문 가능
    * 회원등급에 따라 할인정책 다르게 적용가능 (유동적)
    
#3. 회원 도메인 설계



