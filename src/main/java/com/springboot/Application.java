package com.springboot;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

// 프로젝트의 메인클래스
// @SpringBootApplication -> 이 어노테이션이 있는 위치부터 설정을 읽어나가기 때문에,
// 항상 프로젝트 최상단의 위치해야한다

@EnableJpaAuditing
@SpringBootApplication // -> 자동설정, 스프링 bean 읽기, 생성을 자동으로 설정
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        // -> 내장 WAS(Web Application Server)를 실행한다. == 톰캣이 내장되어 있음
    }
}
