package com;

import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.bean")
public class Config {

	@Bean
	public Date getDate() {

		return new Date();
	}
}
