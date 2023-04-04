package com.library;

import java.util.Scanner;

public class Application {
	Scanner sc = new Scanner(System.in);

	//도서관 생성
	Library lib = new Library("file");
	
	public static void main(String[] args) {
			
		Application app = new Application();
		logout:
			while(true) {
		//로그인 처리
		System.out.println("아이디를 입력해주세요");
		String id = app.getString();
		
			if("admin".equals(id)) {
				//관리자
				System.out.println("관리자 모드로 로그인했습니다");
				app.adminMenu();
			} else {
				System.out.println("사용자 모드로 로그인했습니다");
				app.memberMenu();
			}
		}
		
		
		
		
		
	}
	
	private void adminMenu() {
		Application app = new Application();
		//도서목록 출력
		while(true) {
			lib.info();
			//메뉴확인
			System.out.println("1. 도서등록 2. 도서삭제 0. 로그아웃 q. 시스템 종료");
			System.out.println("메뉴를 입력해주세요");
			int menu = app.getInt();
			
			//메뉴별로 작업 수행
			if(menu == 1) {
				System.out.println("도서를 추가합니다");
				System.out.println("일련번호>");
				int no = app.getInt();
				System.out.println("도서명>");
				String title = app.getString();
				System.out.println("저자명>");
				String author = app.getString();
				lib.addBook(no, title, author, false);
				System.out.println("정상적으로 등록되었습니다");
			} else if(menu == 2) {
				System.out.println("삭제할 도서번호를 입력해주세요");
				int index = app.getInt();
				lib.deleteBook(index);
				System.out.println("정상적으로 삭제되었습니다");
			} else if(menu==0) {
				System.out.println("로그아웃 합니다");
				break;
			} else {
				System.err.println("메뉴를 확인해주세요");
			}
		}
	}
	
	private void memberMenu() {
		Application app = new Application();
		while(true) {
			lib.info();
			//메뉴확인
			System.out.println("1. 도서대여 2. 도서반납 0. 로그아웃 q. 시스템 종료");
			System.out.println("메뉴를 입력해주세요");
			int menu = app.getInt();
			
			//메뉴별로 작업 수행
			if(menu == 1) {
				System.out.println("도서번호를 입력해주세요");
				int index = app.getInt();
				lib.rentBook(index);
			} else if(menu == 2) {
				System.out.println("도서번호를 입력해주세요");
				int index = app.getInt();
				lib.returnBook(index);
			}  else if(menu==0) {
				System.out.println("로그아웃 합니다");
			}else {
				System.err.println("메뉴를 확인해주세요");
			}					
		}
	}
	
	/**
	 * 사용자로부터 문자를 입력받습니다
	 * @return
	 */
	public String getString() {
		String res= "";
		
		while(true) {
			try {
				res=sc.next();
				if(res.equalsIgnoreCase("q")) {
					System.out.println("프로그램 종료");
					System.exit(0);
				}
				
				break;
				
			} catch (Exception e) {
				System.err.println("오류발생");
				System.out.println("숫자를 입력해주세요");
			}			
		}
		
		return res;
		
	}
	
	/**
	 * 사용자로부터 숫자를 입력받습니다
	 * @return
	 */
	public int getInt() {
		int i= 0;
		
		while(true) {
			String res;
			try {
				res=sc.next();
				if(res.equalsIgnoreCase("q")) {
					System.out.println("프로그램 종료");
					System.exit(0);
				}
				i= Integer.parseInt(res);
				break;
				
			} catch (Exception e) {
				System.err.println("오류발생");
			}			
		}
		
		return i;
		
	}
	
	
}
