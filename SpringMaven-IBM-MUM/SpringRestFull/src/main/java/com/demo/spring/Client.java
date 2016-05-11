package com.demo.spring;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

public class Client {

	public static void main(String[] args) {
		RestTemplate template = new RestTemplate();
		UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl("http://localhost:8080/SpringRestFull/rest/test")
		        .queryParam("name", "Shantanu");
		        
		ResponseEntity<String> resp = template.getForEntity(builder.build().toUri(), String.class);
		System.out.println(resp.getBody());
	}

}
