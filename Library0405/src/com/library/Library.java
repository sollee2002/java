package com.library;

import java.util.Collections;
import java.util.List;

import com.library.dao.Dao;
import com.library.dao.FileDao;
import com.library.vo.Book;
//ctrl+h = 파일 찾기

public class Library {
	
	//책 목록 - 필드
	//필드로 선언 시 클래스 내부에서 자유롭게 이용이 가능하다(=전역변수)
	List<Book> list = null;
	//인터페이스를 타입으로 선언
	Dao dao = new FileDao();
	
	//생성자
	//클래스명과 동일한 이름을 가진다
	//반환타입이 없다
	public Library() {
		//FileDao 에서 가져온 리스트를 Library의 list에 저장
		//필드를 초기화시킴
		list = dao.getList();
		System.out.print(toString()); //같은 파일 내 메소드는 그냥 선언 가능
	}
	
	//책 리스트 출력
	@Override
	public String toString() {
		System.out.println("=====책 목록=====");
		String info = "";
		
		//정렬
		Collections.sort(list);
		
		for(Book book : list) {
			info += book.info()+"\n";
		}		
		return info;
	}
	
	//책의 정보를 받아서 리스트에 등록 후 파일로 출력합니다
	public boolean insertBook(int no, String title, String author, boolean isRent) {
		
		//일련번호 중복 체크
		for(Book book : list) {
			if(book.getNo()==no) {
				System.err.println("중복된 일련번호입니다\n다시 입력해주세요");
				return false;
			}
		}
		
		//책을 생성
		Book book = new Book(no,title,author,isRent);
		
		//리스트에 등록
		list.add(book);
		
		//리스트를 파일로 출력
		boolean res = dao.listToFile(list);
		
		//파일에 정상적으로 등록이 되지 않은 경우 리스트에서 제거
		if(!res) {
			list.remove(book);
			System.err.println("책이 등록되지 않았습니다\n 관리자에게 문의하세요");
			return false;
		}
		System.out.println("책이 등록되었습니다");
		System.out.println(toString());

		return true;
	}

	/**
	 * 책의 일련번호를 입력받아서 리스트에서 삭제합니다
	 * 리스트를 파일로 출력합니다
	 * @param no
	 * @return
	 */
	public boolean deleteBook(int no) {
		
		System.out.println(no+"책을 삭제합니다");
		
		for(Book book : list) {
			if(book.getNo() == no) {
				//삭제
				list.remove(book);
			
				//리스트를 파일로 출력
				boolean res = dao.listToFile(list);
				
				if(!res) {
					//파일로 출력이 실패할 경우 책을 다시 리스트에 추가합니다
					list.add(book);
					System.err.println("파일 출력도중 오류가 발생했습니다\n deleteBook()");
					return false;
				}
				System.out.println("정상적으로 삭제되었습니다");
				System.out.println(toString());
				return true;
			} 
		}
		System.out.println("일치하는 일련번호가 없습니다");
		return false;
	}
	
	/**
	 * 일련번호에 해당하는 책을 찾는다
	 * 책의 상태가 렌트가 가능한 상태(isRent == false) 라면 렌트 후 리스트 파일 출력
	 * 아닐 경우 오류 출력
	 * @param no
	 * @return
	 */
	public boolean rentBook(int no) {
		
		System.out.println(no+"책을 대여합니다");
		
		for(Book book : list) {
			//일련번호에 해당하는 책 찾기
			if(book.getNo()==no) {
				//대여가능 여부 확인
				if(book.isRent()==false) {
					//대여가능 -> 대여중 상태변경
					book.setRent(true);
					
					//리스트를 파일로 출력
					boolean res = dao.listToFile(list);
					if(!res) {
						book.setRent(false);
						System.err.println("오류가 발생했습니다");	
						return false;
					}
					System.out.println("대여완료");
					System.out.println(toString());
					return true;
				}
			}
		}
		
		System.out.println("일치하는 일련번호가 없습니다");
		return false;
	}

	/**
	 * 일련번호에 해당하는 책을 찾는다
	 * 도서가 대여중이라면 반납처리
	 * 아니면 (반납가능한 도서가 아닙니다) 메세지 처리
	 * @param no
	 * @return
	 */
	public boolean returnBook(int no) {
		
		System.out.println(no+"책을 반납합니다");

		for(Book book : list) {
			
			if(book.getNo()==no) {
				
				if(book.isRent()==true) {
					
					book.setRent(false);
					
					//리스트를 파일로 출력
					boolean res = dao.listToFile(list);
					
					if(!res) {
						book.setRent(true);
						System.out.println("오류가 발생했습니다");	
						return false;
					}
					System.out.println("반납되었습니다");
					System.out.println(toString());
					return true;
				} else {
					System.out.println("반납가능한 도서가 아닙니다");
				}
			}
		}
		
		System.out.println("일치하는 일련번호가 없습니다");
		return false;
	}
	

}
