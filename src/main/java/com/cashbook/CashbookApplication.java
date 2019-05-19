package com.cashbook;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cashbook.dao")
public class CashbookApplication {

    public static void main(String[] args) {
        SpringApplication.run(CashbookApplication.class, args);
    }

}
