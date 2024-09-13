package com.design;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author Lumos
 */
@SpringBootApplication
@EnableTransactionManagement
public class designApplication {
    public static void main(String[] args) {
        SpringApplication.run(designApplication.class,args);
    }
}
