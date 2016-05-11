package com.demo.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = { "com.demo.spring" })
public class AppConfig {

	@Bean
	public PlainTextWriter plainTextWriter() {
		PlainTextWriter writer = new PlainTextWriter();
		return writer;
	}

	@Bean
	public NiceWriter niceWriter() {
		NiceWriter writer = new NiceWriter();
		return writer;
	}

	@Bean
	public WriterApp writerApp() {
		WriterApp app = new WriterApp();
		return app;
	}

}
