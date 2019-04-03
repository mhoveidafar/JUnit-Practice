package com.mhoveidafar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource(value = "${external_config1}/application.properties")
public class SpringBootJUnitTestPractice {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJUnitTestPractice.class, args);
	}
}

