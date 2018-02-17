package com.csye6225.spring2018;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

@SpringBootApplication
public class SpringBootWebApplication {

  public static void main(String[] args) throws Exception {
    SpringApplication.run(SpringBootWebApplication.class, args);

  }

}
