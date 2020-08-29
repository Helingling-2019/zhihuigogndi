package com.hnhy99999.mybatis.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication

@ImportResource(locations = {"classpath:spring-mvc.xml"})
public class ZhgdApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZhgdApplication.class, args);
    }

}
