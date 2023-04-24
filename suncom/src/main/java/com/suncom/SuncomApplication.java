package com.suncom;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.suncom.dao")
public class SuncomApplication {

	public static void main(String[] args) {
		SpringApplication.run(SuncomApplication.class, args);
	}

}
