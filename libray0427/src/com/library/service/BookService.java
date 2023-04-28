package com.library.service;

import java.util.List;

import com.library.dao.BookDao;
import com.library.dao.RentDao;
import com.library.vo.Book;

public class BookService {
	BookDao dao = new BookDao();
	Book book = new Book();
	
	public List<Book> getlist() {
		List<Book> list =  dao.getList();
		
		System.out.println("=============도서목록=============");
		for(Book book : list) {
			System.out.println(book);
		}
		System.out.println("================================");
		
		return list;
	}
	
	public int addBook(Book book) {
		
		int res = dao.insert(book);
		
		if(res>0) {
			System.out.println("입력되었습니다");
			//책 리스트 출력
			System.out.println(dao.getList());
			
			return res;
		} else {
			System.out.println("입력 중 오류가 발생했습니다");
		}
		return 0;
	}

	public void deleteBook(int no) {
		
		int res = dao.delete(no);
		
		if(res>0) {
			System.out.println("삭제되었습니다");
			//책 리스트 출력
			System.out.println(dao.getList());

		} else {
			System.out.println("삭제 중 오류가 발생했습니다");
		}
		
	}
	
	public void rentBook(int no) {
		String yn =dao.getRentyn(no);
		RentDao rentdao = new RentDao();
		
		if(rentdao.getRentYN(no).equals("Y")) {
			System.out.println("이미 대여중인 책입니다");
		} else if (rentdao.getRentYN(no).equals("N")) {
			System.out.println("없는 책입니다");
		} else {
			int res = dao.update(no, "Y");
			
			if(res>0) {
				System.out.println(res+"건 대여되었습니다");
				
			}			
		}
		
		
//		boolean yn = selStatus(no,"N");
//		
//		if(yn) {
//			int res = dao.update(no, "Y");
//			System.out.println("대여되었습니다");
//			
//		}else {
//			System.out.println("대여할 수 없습니다. 관리자에게 문의하세요");
//		}
	}
	
	public void returnBook(int no) {
		
		boolean yn = selStatus(no,"Y");
		
		if(yn) {
			int res = dao.update(no, "N");
			System.out.println("반납처리되었습니다");
			
		}else {
			System.out.println("반납할 수 없습니다. 관리자에게 문의하세요");
		}
	}
	
	public boolean selStatus(int no,String rentyn) {
		
		boolean res = dao.selStatus(no,rentyn);
		
		return res;
	}

}
