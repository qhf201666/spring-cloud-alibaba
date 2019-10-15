package com.dywl.logistics.crm;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author qhf
 */
@Slf4j
@EnableTransactionManagement
@SpringBootApplication
public class ServiceApplication implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplication.run(ServiceApplication.class);
  }

  @Override
  public void run(String... args) {
    log.info("order service started!");
  }
}
