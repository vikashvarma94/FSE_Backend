package com.codewitharjun.fullstackbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class fullstackbackendapplication {

	public static void main(String[] args) {
		SpringApplication.run(fullstackbackendapplication.class, args);
	}

}

