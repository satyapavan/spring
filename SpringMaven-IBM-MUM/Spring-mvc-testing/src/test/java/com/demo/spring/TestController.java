package com.demo.spring;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;

import java.awt.print.Printable;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.ResourceBundleViewResolver;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration("classpath:springapp-servlet.xml")
@TransactionConfiguration(transactionManager="transactionManager")
@Transactional
public class TestController {
	MockMvc mockMvc;
	@Autowired
	HibernateTemplate hibernateTemplate;
	@Before
	public void init() {
		AnnLoginController lc=new AnnLoginController();
		lc.setHibernateTemplate(hibernateTemplate);
		mockMvc = MockMvcBuilders.standaloneSetup(lc)
				.setViewResolvers(viewResolver()).build();
	}

	@Test
	public void getAllMediaTest1() throws Exception {
		mockMvc.perform(get("/login.do")).andExpect(status().isOk())
				.andExpect(forwardedUrl("/pages/login.jsp")).andDo(print());

	}

	@Test
	public void testLogin() throws Exception {
		User user = new User();
		user.setUserName("shantanu");
		user.setPassword("welcome1");
		mockMvc.perform(
				post("/login.do").contentType(
						MediaType.APPLICATION_FORM_URLENCODED).
						param("userName", user.getUserName()).
						param("password",user.getPassword()).sessionAttr("userCommand", new User())).andExpect(status().isOk())
						.andExpect(forwardedUrl("/pages/success1.jsp"));
	

	}

	private ViewResolver viewResolver() {
		ResourceBundleViewResolver viewresolver = new ResourceBundleViewResolver();
		viewresolver.setBasename("views");

		return viewresolver;
	}
}
