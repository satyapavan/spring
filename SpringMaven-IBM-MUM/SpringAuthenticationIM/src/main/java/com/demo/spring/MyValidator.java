package com.demo.spring;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class MyValidator implements Validator {
	public boolean supports(Class<?> u) {

		return u.equals(User.class);
	}

	public void validate(Object obj, Errors errors) {
		User user = (User) obj;
		if (user.getEmail().indexOf("@") == -1) {
			errors.rejectValue("email", "email.msg", "Email is invalid..");
		}
		if (user.getName().length() < 8) {
			errors.rejectValue("name", "name.msg",
					"user name must be more than 8 chars");
		}

	}
}
