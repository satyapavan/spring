package com.demo.spring;

import java.util.Arrays;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCache;
import org.springframework.cache.support.SimpleCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableCaching
public class AppConfig {
	@Bean
	public Mail mail() {
		return new Mail();
	}

	@Bean
	public Message message() {
		return new Message();
	}
	
	@Bean
	public CacheManager cacheManager() {
		SimpleCacheManager cm = new SimpleCacheManager();
		cm.setCaches(Arrays.asList(new ConcurrentMapCache("demo")));
		return cm;
	}
}
