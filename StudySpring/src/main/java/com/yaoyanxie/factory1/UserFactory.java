package com.yaoyanxie.factory1;

public class UserFactory {
	public UserFactory() {
		// TODO Auto-generated constructor stub
		System.out.println("iiiii");
	}
	public UserService createService() {
		return new UserServiceImpl();
	}
}
