package com.yaoyanxie.factory;

public class UserFactory {
	public UserFactory() {
		System.out.println("sssss");
	}

	public static UserService createService() {
		return new UserServiceImpl();
	}
}
