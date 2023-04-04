package com.library.dao;

import java.util.List;

import com.library.vo.Book;

public interface Dao {
	
	Book getBookList(); //책 리스트 조회
	
	int insertBook(Book book); //신규 도서 등록

	int deleteBook(Book book); //도서 삭제
	
	boolean updatBook(Book book); //도서 정보 업데이트
	
	
}
