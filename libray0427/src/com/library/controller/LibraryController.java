package com.library.controller;

import java.util.Scanner;

import com.library.service.BookService;
import com.library.service.MemberService;
import com.library.service.RentService;
import com.library.vo.Book;
import com.library.vo.Member;

/**
 * 도서대여 시스템 
 * 
 * 사용자로부터 입력을 받아 사용자 요청에 알맞은 서비스 로직 호출
 * 
 * 1.로그인
 *  - 관리자
 *  	: 도서등록 도서삭제 사용자등록 사용자삭제
 *  - 사용자
 *  	: 도서대여 도서반납 도서대여현황
 *  
 * 2. 
 * @author user
 *
 */

public class LibraryController {
	
	Scanner sc = new Scanner(System.in);
	MemberService Memberservice = new MemberService();
	BookService Bookservice = new BookService();
	RentService Rentservice = new RentService();
	
	public void library() {
		System.out.println("====================");
		System.out.println("도서관리 시스템 v1.0");
		System.out.println("====================");
		
		while(true) {
			Member member  = login();
			System.out.println(member.getName()+"님 환영합니다");
			
			
			if(member.getAdminyn().equalsIgnoreCase("Y")) {
				//관리자메뉴실행
				adminMenu();
			} else {
				//사용자메뉴실행
				userMenu(member);
			}
		}
		
		
	}

	private void adminMenu() {
		Label :
		while(true) {
		Bookservice.getlist();
		System.out.println("관리자메뉴>>>");
		System.out.println("1. 도서등록 2. 도서삭제 3. 사용자등록 4. 사용자삭제 "
							+"0. 로그아웃 q. 종료");
			System.out.println("================================");
			System.out.println("메뉴를 선택해주세요>>>");
			
			int menu = getInt();
			
			switch(menu) {
			case 1:
				//도서등록
				//사용자로부터 입력받기 - 도서명 작가명
				//controller > service > dao > data
				
				
				System.out.println("도서명 입력>");
				String title = getString();
				System.out.println("작가 입력>");
				String author = getString();
				Bookservice.addBook(new Book (title,author));
				break;
				
			case 2:
				//도서삭제
				System.out.println("삭제할 도서의 일련번호>");
				int no = getInt();
				Bookservice.deleteBook(no);
				break;
				
			case 3:
				//사용자등록
				System.out.println("등록할 사용자의 id>");
				String id = getString();
				System.out.println("등록할 사용자의 pw>");
				String pw = getString();
				System.out.println("등록할 사용자의 name>");
				String name = getString();
				
				System.out.println("관리자 계정은 Y를 입력해주세요");
				String adminYNStr = getString();
				String adminYN = adminYNStr.equalsIgnoreCase("y")? "Y" : "N"; 
				
				Memberservice.addMember(id,pw,name,adminYN);
				break;
			case 4:
				//사용자삭제
				Memberservice.getlist();
				System.out.println("삭제할 사용자의 id>");
				id = getString();
				Memberservice.deleteMember(id);
				break;
			case 0:
				//로그아웃
				System.out.println("로그아웃합니다");
				break Label;
			default :
				System.out.println("잘못된 번호입니다");
				
			}
			
		}
		
		
	}

	private void userMenu(Member member) {
		Label :
		while(true) {
		Bookservice.getlist();
		System.out.println("관리자메뉴>>>");
		System.out.println("1. 도서대여 2. 도서반납 0. 로그아웃 q. 종료");
			System.out.println("================================");
			System.out.println("메뉴를 선택해주세요>>>");
			
			int menu = getInt();
			
			switch(menu) {
			case 1:
				//도서대여
				System.out.println("대여할 도서의 일련번호>");
				int no = getInt();
				Rentservice.rentBook(no,member.getId());
				break;
				
			case 2:
				//도서반납
				System.out.println("반납할 도서의 일련번호>");
				no = getInt();
				Rentservice.returnBook(no);
				break;
				
			case 0:
				//로그아웃
				System.out.println("로그아웃합니다");
				break Label;
			default :
				System.out.println("잘못된 번호입니다");				
				
			}
			
		}
		
	}


	public Member login() {		
		
		while(true) {
			System.out.println("로그인");
			System.out.println("id를 입력해주세요");
			String id = getString();
			System.out.println("pw를 입력해주세요");
			String pw = getString();
			
			Member member = Memberservice.login(id, pw);
			if(member == null) {
				System.out.println("아이디/비밀번호를 확인해주세요");
			} else {
				return member;
			}
			
		}
		
	}

	//문자반환
	///q,Q 입력 시 종료
	private String getString() {
		String str = "";
		
		while(true) {
		str = sc.next();
		
		if(str.equalsIgnoreCase("Q")) {
			System.out.println("종료합니다");
			System.exit(0);
		}
		return str;
		}
		
	}
	
	//숫자반환
	private int getInt() {
		int i = 0;
		
		while(true) {
			try {
				i = sc.nextInt();
				return i;
				
			} catch (Exception e) {
				String str = sc.next();
				//q면 정상종료
				if (str.equalsIgnoreCase("Q")) {
					System.out.println("종료합니다");
					System.exit(0);				
				}
				System.out.println(str+"은 입력불가능합니다");
				System.out.println("숫자를 입력해주세요");
			} 
			
		}
		
	}
	
	

}
