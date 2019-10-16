package com.dywl.logistics.crm;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 系统启动类
 *
 * @author 陈世峰
 */
@Slf4j
@EnableTransactionManagement
@SpringBootApplication
@MapperScan("com.dywl.logistics.model.crm.mapper")
public class ServiceApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ServiceApplication.class);
    }

    @Override
    public void run(String... args) {
        log.info("crm service started!");
    }
}
