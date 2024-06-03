package com.springcloudstream.example

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
@EnableBatchProcessing
class Application {
    static void main(String[] args) {
        SpringApplication.run(Application.class, args)
    }
}
