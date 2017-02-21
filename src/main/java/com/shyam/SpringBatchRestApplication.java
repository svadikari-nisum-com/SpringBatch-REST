package com.shyam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.shyam"})
public class SpringBatchRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(new Object[] { SpringBatchRestApplication.class }, args);
	}
}
