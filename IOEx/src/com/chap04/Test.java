package com.chap04;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.chap03.Book;

public class Test {
	
	public static void main(String[] args) {
		
		try (BufferedReader br = new BufferedReader(new FileReader("booklist.txt")))
		{
			String str = "";
			List<Book> list = new ArrayList<>();
			
			while((str=br.readLine()) != null) {
				String[] strAyy = str.split(" ");
				
				int no = Integer.parseInt(strAyy[0]);
				String title = strAyy[1];
				String author = strAyy[2];
				boolean isRent = Boolean.parseBoolean(strAyy[3]);
				
				Book book = new Book(no,title,author,isRent);
				list.add(book);
					
			}
			System.out.println("파일로부터 읽어들인 책 정보를 출력합니다");
			for(Book b : list) {
				System.out.println(b.toString());
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("==================================");
		String str = "1/타이틀1/작가1/false";
		//책을 생성하는데 필요한 값들을 구분자를 이용하여 배열에 저장
		//매개변수 구분자를 이용하여 문자열을 자르고 배열로 반환
		String[] strAyy = str.split("/"); //()안 문자기준 문자열 끊어서 저장
		
		int no = Integer.parseInt(strAyy[0]);
		String title = strAyy[1];
		String author = strAyy[2];
		boolean isreturn = Boolean.parseBoolean(strAyy[3]);
		
		Book book = new Book(no, title, author, isreturn);
		System.out.println(book.toString());
		
		System.out.println("===================================");
		
		for(String s : strAyy) {
			System.out.println(s);
		}
		
		
		
	}

}
