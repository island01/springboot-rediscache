package com.qyer;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.qyer.mapper")

public class SpringbootRediscacheApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootRediscacheApplication.class, args);
	}
}
