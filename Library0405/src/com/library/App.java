package com.library;

import java.util.Scanner;

public class App {

	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//app을 생성하지 않고 getString(), getInt() 메소드를 사용할 수 없다
		//정적 메소드의 (정적)필드에서는 인스턴스필드를 사용할 수 없다
		//또는 getString(), getInt()를 정적 멤버로 만들어 줍니다
		App app = new App();
		
		//라이브러리 생성
		Library lib = new Library();
		
		//자주 사용하는 로직은 메서드로 빼서 만들면 코드가 간결해집니다
		//스캐너로부터 입력을 받아서 리턴해주는 역할
		
		//로그인 처리
		//아이디를 입력받아 admin이면 관리자 아니면 사용자
		//관리자: 책 등록, 책 삭제 | 사용자: 책 대여, 책 반납
		logout:
		while(true) {
			System.out.print("로그인=============\nID: ");
			String id = app.getString();
			
			//관리자 계정 로그인
			if(id.equalsIgnoreCase("admin")) {
				
				System.out.println("관리자 계정으로 로그인 했습니다");
				
				while(true) {
					//메뉴 출력
					System.out.println("1. 책 등록 2. 책 삭제 3. 로그아웃 q. 종료");
					System.out.print("> ");
					int menu = app.getInt();
					int no = 0;
					
					switch(menu) {
					//책 등록
					case 1 :
						
						System.out.println("====신규 도서를 등록합니다====");
						while(true) {
							System.out.println("뒤로가기 b, 계속하려면 아무키나");
							if(app.getString().equalsIgnoreCase("b")) {
								break;
								
							} else {
								System.out.print("일련번호> ");
								no = app.getInt();
								System.out.print("도서명> ");
								String title = app.getString();
								System.out.print("저자명> ");
								String author = app.getString();
								
								lib.insertBook(no, title, author, false);								
							}
						}
						
						break;
					//책 삭제
					case 2 :
						System.out.println("====도서를 삭제합니다====");
						
						while(true) {
							System.out.println("뒤로가기 b, 계속하려면 아무키나");
							if(app.getString().equalsIgnoreCase("b")) {
								break;
							
							} else {
								System.out.print("일련번호> ");
								no = app.getInt();
					
								lib.deleteBook(no);
							}
						}
						break;
						
					case 3 :
						System.out.println("로그아웃 합니다");
						continue logout;

					default :
						System.out.println("해당 메뉴는 존재하지 않습니다");
						break;
					}
					
				} //관리자 끝
				
				
			//사용자 계정 로그인
			} else {
				System.out.println(id+"님 환영합니다");
				
				while(true) {
					//메뉴 출력
					System.out.println("1. 책 대여 2. 책 반납 3. 로그아웃 q. 종료");
					System.out.print("> ");
					int menu = app.getInt();
					int no = 0;
					
					switch(menu) {
					//책 대여
					case 1 :
						System.out.println("<대여>========");
						while(true) {
							System.out.println("뒤로가기 b, 계속하려면 아무키나");
							if(app.getString().equalsIgnoreCase("b")) {
								break;
								
							} else {
								System.out.println(lib.toString());
								System.out.print("일련번호> ");
								no = app.getInt();
						
								lib.rentBook(no);
							}
						}
						
						break;
					//책 반납
					case 2 :
						System.out.println("<반납>========");
						
						while(true) {
							System.out.println("뒤로가기 b, 계속하려면 아무키나");
							if(app.getString().equalsIgnoreCase("b")) {
								break;
								
							} else {
								System.out.println(lib.toString());
								System.out.print("일련번호> ");
								no = app.getInt();
						
								lib.returnBook(no);
							}
						}
						
						break;
						
					case 3 :
						System.out.println("로그아웃 합니다");
						continue logout;

					default :
						System.out.println("해당 메뉴는 존재하지 않습니다");
						break;
					}
					
				} //사용자 끝
			}			 
		}
	}
	
	/**
	 * 사용자로부터 입력받은 문자열을 반환합니다
	 * 숫자가 입력될 경우 다시 입력을 요청합니다
	 * Q/q가 입력될 경우 프로그램 종료
	 * @return
	 */
	public String getString() {
		
		String str = "";
		
		while(true) {
			try {
				str = sc.next();
				//q가 입력된 경우 프로그램 종료
				if(str.equalsIgnoreCase("q")) {
					System.out.println("프로그램을 종료합니다");
					System.exit(0);
				}
				//숫자로 변환 시 숫자로 변환되면 문자를 입력해달라고 다시 요청
				Integer.parseInt(str);
				System.err.println("문자를 입력해주세요");
			} catch (Exception e) {
				//문자가 입력된 경우 반복문 탈출
				break;			
			}
		}
		
		return str;
	}
	
	/**
	 * 사용자로부터 정수를 입력받아 반환합니다
	 * 문자가 입력될 경우 다시 입력을 요청합니다
	 * Q/q가 입력될 경우 프로그램 종료
	 * @return
	 */
	public int getInt() {
		
		String str ="";
		int i = 0;
		
		while(true) {
			//사용자 입력 받기
			try{
			str=sc.next();
			//q인지 확인하기
			if(str.equalsIgnoreCase("q")) {
				System.out.println("프로그램을 종료합니다");
				System.exit(0);
			}
			
				//숫자로 변환하기
				i = Integer.parseInt(str);
				break;	
			} catch(Exception e) {
				//오류 발생 시 다시 사용자 입력으로
				System.out.println("숫자만 입력가능합니다");
			}			
		}
		return i;		
	}
	
	
	
	

}
