package com.library;

import java.util.Scanner;

public class App {
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		App app = new App();
		
		System.out.println("이름 입력> ");
		String name = app.getString();
		
		System.out.println("나이 입력> ");
		int age = app.getInt();
		
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		
	}
	
	public String getString() {
		String res = "";
		while(true) {
		try {
				 res=sc.next();
				if(res.equalsIgnoreCase("q")) {
					System.out.println("종료합니다");
					System.exit(0);
				}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
				break;
			} catch (Exception e) {
			System.out.println("오류발생");
			System.out.println("문자를 입력하세요");
		}
		}
	
		return res;
	}
	
	public int getInt() {
		int i=0;
		while(true) {
		try {			
			String res = "";
				res=sc.next();
				if(res.equalsIgnoreCase("q")) {
					System.out.println("종료합니다");
					System.exit(0);
				}
				i = Integer.parseInt(res);
				break;
			} catch (Exception e) {
			System.out.println("오류 발생");
			System.out.println("숫자를 입력하세요");
		}
		}
		
		return i;
	}
	
	
	
	
	

}
