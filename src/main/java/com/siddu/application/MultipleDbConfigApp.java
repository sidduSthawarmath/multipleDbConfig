package com.siddu.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.siddu")
public class MultipleDbConfigApp {
	  public static void main(String[] args) {
	        SpringApplication.run(MultipleDbConfigApp.class, args);
	    }
}
