package com.demo.spring;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

public class PostClient {

	public static void main(String[] args) {
		RestTemplate template = new RestTemplate();
		User user = new User();
		user.setEmail("sbtalk@yahoo.com");
		user.setName("Shantanu");
		user.setAddress("Hyderabad");
		user.setPhone("4444455");
		//ResponseEntity<String> response=template.postForEntity("http://localhost:8080/SpringRestFull/rest/saveUser", user, String.class);
		
		
		//template.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
		
		HttpEntity<User> request = new HttpEntity<User>(user);
		ResponseEntity<String> response = template.exchange(
				"http://localhost:8080/SpringRestFull/rest/saveUser",
				HttpMethod.POST, request, String.class);

		System.out.println(response.getBody());
	}

}
