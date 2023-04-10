package com.library.service;

import java.util.List;

import com.library.dao.BookDao;
import com.library.vo.BookVo;
/**
 * 비지니스 로직
 * 
 * 사용자 요청 검증
 * DB CRUD 요청
 * 사용자 요구에 맞게 반환
 * 
 * Dao 호출                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
 * @author user
 *
 */
public class BookService {
	
	BookDao bookDao = new BookDao();

	
	public void getlist() {
		
		List<BookVo> list = bookDao.getlist();
		
		for(BookVo book : list) {
			System.out.println(book.toString());
		}
		
		
	}


	public int insertBook(BookVo bookVo) {
		
		int res = bookDao.insertBook(bookVo);
		
		if(res>0) {
			System.out.println("입력되었습니다");
			//책 리스트 출력
			System.out.println(bookDao.getlist());
			
			return res;
		} else {
			System.out.println("입력 중 오류가 발생했습니다");
		}
		return 0;
	}


	public void deleteBook(int bookNo) {
		
		int res = bookDao.deleteBook(bookNo);
		
		if(res>0) {
			System.out.println("삭제되었습니다");
			//책 리스트 출력
			System.out.println(bookDao.getlist());
		} else {
			System.out.println("삭제 중 오류가 발생했습니다");
		}
		
	}


	public void rentBook(int bookNo) {

		boolean flg = selStatus(bookNo,"N");
		
		if(flg) {
			int res = bookDao.updateBook(bookNo,"Y");
			
			if(res>0) {
				System.out.println("대여되었습니다");
				//책 리스트 출력
				System.out.println(bookDao.getlist());
				
			} else {
				System.err.println("대여 중 문제가 발생했습니다");
			}
			
		} else {
			System.err.println("이미 대여중인 책입니다");
		}
		
		
		
	}


	public void returnBook(int bookNo) {
		
		boolean flg = selStatus(bookNo,"Y");
		
		if(flg) {
			int res = bookDao.updateBook(bookNo,"N");
			
			if(res>0) {
				System.out.println("반납되었습니다");
				//책 리스트 출력
				System.out.println(bookDao.getlist());
				
			} else {
				System.out.println("반납 중 오류가 발생했습니다");
			}
		} else {
			System.out.println("반납가능한 책이 아닙니다");
		}
		
	}
	
	
	public boolean selStatus(int bookNo,String rentYN) {
		
		boolean res = bookDao.selStatus(bookNo,rentYN);
		
		return res;
	}
	
}
