package com.library.dao;

import java.util.List;

import com.library.vo.Book;

public class DBDao implements Dao{

	@Override
	public Book getBookList() {
		System.out.println("DB-리스트 조회");
		return null;
	}

	@Override
	public int insertBook(Book book) {
		System.out.println("DB-도서정보 입력");
		return 0;
	}

	@Override
	public int deleteBook(Book book) {
		System.out.println("DB-도서정보 삭제");
		return 0;
	}

	@Override
	public boolean updatBook(Book book) {
		System.out.println("DB-도서정보 수정");
		return false;
	}

}
