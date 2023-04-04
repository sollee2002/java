package com.library.dao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.library.vo.Book;

public class FileDao implements Dao {
	
	public static void main(String[] args) {
	
		FileDao dao = new FileDao();
		Book book = new Book();
		
		dao.insertBook(book);
		dao.getBookList();
	
		//ctrl + shift + g : 자신을 호출하고 있는 곳을 알려줌
		//ctrl + shift + r : 파일 검색 가능
	}

	@Override
	public Book getBookList() { //책 리스트 조회
		System.out.println("책 리스트를 조회합니다");
		List<Book> list = new ArrayList<>();
		
		//파일 읽어오기
		try (BufferedReader br = new BufferedReader(new FileReader("booklist.txt")))
		{
			String str = "";
			//null이 될때까지 반복
			while((str=br.readLine()) != null) {
				
				//공백 자르기
				String[] strAyy = str.split(" ");
				
				//책 생성 파라메터 만들기
				int no = Integer.parseInt(strAyy[0]);
				String title = strAyy[1];
				String author = strAyy[2];
				boolean isRent = Boolean.parseBoolean(strAyy[3]);
				
				//리스트 생성
				Book book = new Book(no,title,author,isRent);
				
				//리스트에 책 추가
				list.add(book);				
				}
			
			//리스트에 저장된 책 출력
			for(Book b : list) {
				System.out.println(b.getNo()+" "+
						b.getTitle()+" "+b.getAuthor()+" "+
						b.isRent());
			}
			br.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		} catch(NumberFormatException e2) {
			e2.printStackTrace();
		}
		return null;
		
		//리스트 반환

	}

	@Override
	public int insertBook(Book book) { //신규 도서 등록
		System.out.println("신규 도서를 등록합니다");
		
		try (FileWriter fw = new FileWriter("booklist.txt",true);)
		{
			fw.write("1 책1 작가1 false\n");
			
			fw.close();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		return 0;
	}

	@Override
	public int deleteBook(Book book) { //도서 삭제
		System.out.println("도서를 삭제합니다");
		return 0;
	}

	@Override
	public boolean updatBook(Book book) { //도서 정보 업데이트
		System.out.println("도서 정보를 수정합니다");
		return false;
	}

	
	
	
}
