package com.wooly.designpattern._01_Creational_Pattern._01_Singleton;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

	@Bean
	public String temp() {
		return "TEMP";
	}

}
