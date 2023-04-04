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


	/**
	 * 파일을 읽어서 리스트를 반환
	 * makeBook() 메소드를 이용해 리스트에 책 생성
	 */
	@Override
	public List<Book> getlist() {
		System.out.println("FileDao.getlist() 시작======");
		List<Book> list = new ArrayList<>();


		// 반납할 자원이 있는 경우 try() 안에서 생성할 경우 자동으로 close해줍니다
		try (FileReader fr = new FileReader("booklist.txt"); 
				BufferedReader br = new BufferedReader(fr);) 
		{
			String str = "";
			// 파일로부터 한줄을 읽어들여 null이 될 때까지 반복합니다
			// null = 파일의 끝
			while ((str = br.readLine()) != null) {
				
				Book book = makeBook(str);
				System.out.println("ccc");
				
				if(book != null) {
					System.out.println("bbb");
					list.add(book);					
				}	
			}
			
			fr.close();
			br.close();

		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		} catch (IOException e1) {
			System.err.println(e1.getMessage());
		}

		return list;
	}

	/**
	 * 문자열을 받아서 책을 생성하여 반환합니다
	 * 
	 * @param str
	 * @return
	 */

	/// 접근제한자 반환타입 메소드명(매개변수)
	public Book makeBook(String str) {
		// book을 선언합니다 ===> 반환용
		Book book = null;

		try {
			// 공백을 이용해서 문자열을 잘라 배열로 저장
			String[] strAyy = str.split(" ");

			int no = Integer.parseInt(strAyy[0]);
			String title = strAyy[1];
			String author = strAyy[2];
			boolean isRent = Boolean.parseBoolean(strAyy[3]);

			book = new Book(no, title, author, isRent);

		} catch (Exception e) {
			// 데이터 파싱 중 오류가 발생하더라도 프로그램이 종료되지 않도록
			// try구문을 활용하여 오류를 처리
			System.err.println("리스트 생성 중 오류가 발생하였습니다");
			System.err.println("=========readLine() : " + str);
		}

		// 책이 정상적으로 생성될경우 book을 반환하고
		// 생성 중 오류가 발생 시 null을 반환
		return book;
	}

	@Override
	public boolean fileSave(List<Book> list) {
		//리스트를 파일로 저장합니다
		try (FileWriter fw = new FileWriter("booklist.txt",true);)
		{
			
			for(Book b : list) {
				//책의 정보를 공백으로 연결하여 반환
				fw.write(b.toString()+"\n");
			}
			//파일로 출력 합니다
			fw.close();
			
			//파일 출력 성공
			return true;
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		//파일 출력 실패
		return false;
		
	}

}
