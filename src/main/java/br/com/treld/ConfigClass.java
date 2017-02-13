package br.com.treld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import nz.net.ultraq.thymeleaf.LayoutDialect;

@Configuration
public class ConfigClass {

	@Bean
	public LayoutDialect fuckDialect() {
		return new LayoutDialect();
	}

}
