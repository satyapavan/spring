package com.demo.spring;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:context.xml","classpath:message-context.xml"})

public class AppTest {

	@Autowired
	Mail mail;

	String expectedValue;
	@Before
	public void init(){
		expectedValue="When is the next Break?";
	}
	@Test
	public void testMessageHeader() {
		//assertEquals(expectedValue, mail.getMessage().getHeader());
		mail.getMessage().setBody("No Idea");
		assertThat(expectedValue, equalTo(mail.getMessage().getHeader()));
		
	}
	
	@Test
	//@DirtiesContext
	public void testMessageBody() {
		//assertEquals(expectedValue, mail.getMessage().getHeader());
		System.out.println(mail.getMessage().getBody());
		assertThat("No Idea", equalTo(mail.getMessage().getBody()));
	}
}
