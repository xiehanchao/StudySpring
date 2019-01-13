package com.yaoyanxie.di;


public class UserServiceImpl implements UserService {
	//要和set方法名保持一致
	private BookService mBookService;

	public void setmBookService(BookService bookService) {
		this.mBookService = bookService;
	}

	@Override
	public void add() {
		mBookService.save();
	}




}
