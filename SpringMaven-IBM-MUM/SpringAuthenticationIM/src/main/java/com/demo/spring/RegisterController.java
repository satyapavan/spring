package com.demo.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegisterController {

	@Autowired
	MyValidator validator;

	@RequestMapping(value = "/register.do", method = RequestMethod.GET)
	public String getRegisterPage(ModelMap modelMap) {
		System.out.println("inside the controller");
		User user = new User();
		modelMap.addAttribute("userCommand", user);
		return "register";
	}

	@RequestMapping(value = "/register.do", method = RequestMethod.POST)
	public ModelAndView processForm(@ModelAttribute("userCommand") User user,
			BindingResult br) {
		validator.validate(user, br);

		if (br.hasErrors()) {
			return new ModelAndView("register");
		} else {
			return new ModelAndView("success", "u", user);

		}

	}

}
