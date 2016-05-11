package com.demo.spring_v2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	// Alternative to @Qualifier specifiers
	
 	@Bean
	public PlainTextWriter plainTextWriter(){
		PlainTextWriter pt = new PlainTextWriter();
		return pt;
	}

	@Bean
	public WriterApp writerApp(){
		WriterApp w = new WriterApp();
		return w;
	}
}
