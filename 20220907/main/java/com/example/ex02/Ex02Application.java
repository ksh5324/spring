package com.example.ex02;

import com.example.ex02.components.A;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

@SpringBootApplication
public class Ex02Application {

    public static void main(String[] args) {
        SpringApplication.run(Ex02Application.class, args);
    }

    @Bean
    public A a(){
        return new A();
    }
}
