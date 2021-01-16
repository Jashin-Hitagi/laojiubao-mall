package com.laojiubao.mall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.laojiubao.mall.dao")
public class LaojiubaoMallApplication {

    public static void main(String[] args) {

        System.out.println("启动 Spring Boot...");
        SpringApplication.run(LaojiubaoMallApplication.class, args);

    }

}
