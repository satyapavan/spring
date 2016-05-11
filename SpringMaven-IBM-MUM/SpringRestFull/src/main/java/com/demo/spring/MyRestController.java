package com.demo.spring;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String getGreeting(@RequestParam("name") String name) {
		return "Hello ," + name;
	}

	@RequestMapping(value = "/user", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public User getUserById(@RequestParam("email") String email) {
		User user = new User();
		user.setEmail(email);
		user.setName("Tiger");
		user.setAddress("Sunder Ban");
		user.setPhone("007");
		return user;
	}

	@RequestMapping(value = "/saveUser", method = RequestMethod.POST, produces = MediaType.TEXT_PLAIN_VALUE)
	public String saveUser(@RequestBody User user){
		System.out.println(user.getName()+" "+user.getAddress());
		return "save Success";
	}
}
