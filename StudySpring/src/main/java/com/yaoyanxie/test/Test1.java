package com.yaoyanxie.test;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
	@Test
	public void demo1() {
		String xmlPath = "com/yaoyanxie/test/beans.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
		UserService userService = (UserService) applicationContext.getBean("userServiceId");
		UserService userService1 = (UserService) applicationContext.getBean("userServiceId");
		
		System.out.println(userService);
		System.out.println(userService1);
	}
}
