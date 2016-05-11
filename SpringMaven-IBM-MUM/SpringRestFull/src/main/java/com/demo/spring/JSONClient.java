package com.demo.spring;

import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

public class JSONClient {

	public static void main(String[] args) {
		RestTemplate template = new RestTemplate();
		//template.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
		UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl("http://localhost:8080/SpringRestFull/rest/user")
		        .queryParam("email", "sbtalk@yahoo.com");
		        
		ResponseEntity<User> resp = template.getForEntity(builder.build().toUri(), User.class);
		System.out.println(resp.getBody().getName());
	}

}
