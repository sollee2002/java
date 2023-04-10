package com.library.controller;

import java.util.Scanner;

import com.library.service.BookService;
import com.library.service.MemberService;
import com.library.vo.BookVo;
import com.library.vo.MemberVo;
/**
 * 사용자의 요청을 입력받습니다
 * 요청에 맞는 서비스 로직을 호출 합니다
 * @author user
 *
 */
public class LibraryController {
	
	BookService bookService = new BookService();
	MemberService memberService = new MemberService();
	
	public void Start() {
		
		System.out.println("===============================");
		System.out.println("도서관에 오신 걸 환영합니다.");
		System.out.println("===============================");
		
		while(true) {
			//로그인 요청
			MemberVo memberVo = login();
			//도서목록 출력
			bookService.getlist();
			
			if("Y".equalsIgnoreCase(memberVo.getAdminYN())) {
				//관리자 계정
				adminMenu();
			} else {
				//사용자 계정
				userMenu();
			}
		}
			
		}
	/**
	 * id, pw를 입력받아서 일치하는 고객이 있는지 확인
	 * 로그인이 성공할때까지 반복
	 */
	public MemberVo login() {
		
		while(true) {
			System.out.println("아이디를 입력해주세요");
			String id = getString();
			System.out.println("비밀번호를 입력해주세요");
			String pw = getString();
			
			MemberVo memberVo = memberService.login(id,pw);
			
			if(memberVo != null) {
				return memberVo;
			}			
		}
	}
	
	public static Scanner sc = new Scanner(System.in);

	public static String getString() {
		
		String str = sc.next();
		
		if(str.equalsIgnoreCase("q")) {
			System.out.println("시스템을 종료합니다");
			System.exit(0);
		}

		return str;
	}
	
	public static int getInt() {
		
		int i = 0;
		
		while(true) {
			try {
				String str = sc.next();
				if(str.equalsIgnoreCase("q")) {
					System.out.println("시스템을 종료합니다");
					System.exit(0);
				}
				
				i= Integer.parseInt(str);
				
				return i;

			} catch(Exception e) {
				System.out.println(e.getMessage());
				System.out.println("숫자 입력만 가능합니다");
			}			
		}
	}
	
	public void adminMenu() {
		System.out.println("관리자 메뉴 =============");
		
		outter:
		while(true) {
			System.out.println("1.도서등록 2.도서삭제 3.사용자등록 4.사용자삭제 0.이전메뉴 q.종료");
			System.out.print(">");
			int menu = getInt();
			
			int res = 0;
			int bookNo = 0;
			String id = "";
			switch(menu) {
			case 1:
				//도서 등록
				System.out.println("일련번호 입력> ");
				bookNo = getInt();
				System.out.println("도서명 입력> ");
				String title = getString();
				System.out.println("저자명 입력> ");
				String author = getString();
				
				res = bookService.insertBook(new BookVo (bookNo,title,author,"N"));
				
				break;
				
			case 2:
				//도서 삭제
				System.out.println("삭제할 도서의 일련번호를 입력하세요\n > ");
				bookNo = getInt();
				bookService.deleteBook(bookNo);
				
				break;
				
			case 3:
				//사용자 등록
				System.out.println("등록할 사용자의 아이디를 입력하세요");
				id = getString();
				System.out.println("등록할 사용자의 비밀번호를 입력하세요");
				String pw = getString();
				System.out.println("등록할 사용자의 이름를 입력하세요");
				String name = getString();
				
				System.out.println("관리자 계정은 Y를 입력해주세요");
				String adminYNStr = getString();
				String adminYN = adminYNStr.equalsIgnoreCase("y")? "Y" : "N"; 
				
				res = memberService.insertUser(new MemberVo(id,pw,name,adminYN));
				
				break;
				
			case 4:
				//사용자 삭제
				System.out.println("삭제할 사용자의 아이디를 입력해주세요");
				id = getString();
				memberService.deleteMember(id);
				
				break;
				
			case 0:
				//이전 메뉴
				continue outter;			
				
			default :
				System.out.println("메뉴를 확인 후 다시 입력해주세요");
				break;
				
			}
		}
		
	}
	
	public void userMenu() {
System.out.println("사용자 메뉴 =============");
		
		Label:
		while(true) {
			System.out.println("1.도서대여 2.도서반납 0.이전메뉴 q.종료");
			System.out.print(">");
			int menu = getInt();
			
			int bookNo = 0;
			switch(menu) {
			case 1:
				//도서 대여
				System.out.println("대여할 도서의 일련번호를 입력하세요\n> ");
				bookNo = getInt();
				bookService.rentBook(bookNo);
				
				bookService.getlist();
				
				break;
				
			case 2:
				//도서 반납
				System.out.println("반납할 도서의 일련번호를 입력하세요\n> ");
				bookNo = getInt();
				bookService.returnBook(bookNo);
				
				break;
				
			case 0:
				continue Label;			
				
			default :
				System.out.println("메뉴를 확인 후 다시 입력해주세요");
				break;
				
			}
		}
		
	}
	

}
