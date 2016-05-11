package com.demo.spring;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
@Component
public class LengthValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		clazz.equals(User.class);
		return true;
	}

	@Override
	public void validate(Object object, Errors errors) {
		User user = (User) object;
		if (user.getUserName().length() < 8) {
			errors.rejectValue("userName", "error.name",
					"Name cannot be less than 8 chars");
		}
		if (user.getPassword().length() < 8) {
			errors.rejectValue("password", "error.password",
					"Password cannot be less than 8 chars");
		}

	}

}
