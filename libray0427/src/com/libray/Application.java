package com.libray;

import java.util.List;

import com.library.dao.BookDao;
import com.library.dao.MemberDao;
import com.library.vo.Book;
import com.library.vo.Member;

public class Application {
	
	
	public static void main(String[] args) {
		
//		BookDao dao = new BookDao();
		MemberDao dao = new MemberDao();

		System.out.println(dao.delete("USER2")+"건이 삭제되었습니다");
		
		//id 체크 테스트
//		System.out.println(dao.idCheck("admin"));
		
//		System.out.println(dao.login("admin","1234"));
//		
//		Member member = new Member("USER3", "1234", "사용자2",null,null,null);
//		dao.insert(member);
		
		
//		dao.update(6, "Y");
		
//		dao.delete(6);
		
		//insert() 테스트
//		Book book = new Book("불편한 편의점2","나카사키");
//		dao.insert(book);

		//getList() 테스트
//		List<Book> list = dao.getList();
		
//		for(Book book : list) {
//			System.out.println(book.toString());
//		}

//		리스트를 출력하면 리스트의 요소들의 toString이 출력됩니다
//		System.out.println(dao.getList().toString());
//		System.out.println("=========================");
//		System.out.println(dao.getList());
		
		
		
	}

}
