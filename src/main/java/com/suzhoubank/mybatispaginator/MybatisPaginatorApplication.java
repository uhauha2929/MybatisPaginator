package com.suzhoubank.mybatispaginator;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.suzhoubank.mybatispaginator.mapper")
public class MybatisPaginatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisPaginatorApplication.class, args);
    }

}
