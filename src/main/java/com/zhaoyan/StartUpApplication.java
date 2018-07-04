package com.zhaoyan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication//springboot启动注解
@EntityScan(basePackages = "com.zhaoyan.bean")//扫描实体类映射包
@EnableJpaRepositories(basePackages = "com.zhaoyan.dao")//扫描jpa接口包
@ComponentScan//扫描spring注解包
public class StartUpApplication {

    public static void main(String[] args) {
        SpringApplication.run(StartUpApplication.class, args);
    }

}
