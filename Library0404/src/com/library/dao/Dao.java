package com.library.dao;

import java.util.List;

import com.library.vo.Book;

public interface Dao {
	
	//파일로부터 데이터를 읽어서 리스트에 담아 반환합니다
	List<Book> getlist();

	boolean fileSave(List<Book> list);

}
