package com.yaoyanxie.factory1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
	@Test
	public void demo() {
		String xmlPath = "com/yaoyanxie/factory1/beans.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
		UserService userService = applicationContext.getBean("userServiceId", UserService.class);
		userService.addUser();
	}
}
