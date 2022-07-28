package com.zdy.environment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EnvironmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnvironmentApplication.class, args);
		System.out.println("页面的访问地址：http://localhost:8080/");
	}

}
