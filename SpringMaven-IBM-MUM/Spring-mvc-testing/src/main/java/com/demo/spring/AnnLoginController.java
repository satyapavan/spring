package com.demo.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;

@Controller("/login.do")
public class AnnLoginController {
	
	@RequestMapping(method = RequestMethod.POST)
	public String processForm(@ModelAttribute("userCommand")User user,
			BindingResult bs, SessionStatus status) {
		//System.out.println(user.getUserName());
		System.out.println(hibernateTemplate);
		UserInDb myuser = (UserInDb) hibernateTemplate.get(UserInDb.class, user.getUserName());
		
		//lengthValidator.validate(user, bs);
		if (bs.hasErrors()) {
			return "init";
		} else {
			if (user.getPassword().equals(myuser.getPassword())) {
				return "good";
			} else {
				return "bad";
			}
		}

	}

	@RequestMapping(method = RequestMethod.GET)
	public String getForm(ModelMap map) {
		User user = new User();
		map.put("userCommand", user);
		return "init";
	}

	LengthValidator lengthValidator;

	@Autowired
	public void setLengthValidator(LengthValidator lengthValidator) {
		this.lengthValidator = lengthValidator;
	}

	@Autowired
	HibernateTemplate hibernateTemplate;

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	
	

}
