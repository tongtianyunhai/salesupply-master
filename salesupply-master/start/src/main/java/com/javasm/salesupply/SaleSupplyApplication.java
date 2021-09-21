package com.javasm.salesupply;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan(value = {"com.javasm.salesupply.mapper"})
@EnableTransactionManagement
public class SaleSupplyApplication {

    public static void main(String[] args) {
        SpringApplication.run(SaleSupplyApplication.class, args);
    }

}
