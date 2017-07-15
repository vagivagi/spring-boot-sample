package com.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.thymeleaf.extras.java8time.dialect.Java8TimeDialect;

import nz.net.ultraq.thymeleaf.LayoutDialect;

/**
 * Hello world!
 *
 */

@SpringBootApplication
@RestController
public class SampleBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(SampleBootApplication.class, args);
    }

    @GetMapping("/")
    String home() {
        return "Hello World!";
    }

    @Bean
    public LayoutDialect layoutDialect() {
        return new LayoutDialect();
    }

    @Bean
    public Java8TimeDialect java8TimeDialect() {
        return new Java8TimeDialect();
    }
}
