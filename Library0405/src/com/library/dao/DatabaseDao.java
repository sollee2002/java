package com.library.dao;

import java.util.List;

import com.library.vo.Book;

public class DatabaseDao implements Dao {

	@Override
	public List<Book> getList() {
		return null;
	}

	@Override
	public boolean listToFile(List<Book> list) {
		return false;
	}

}
