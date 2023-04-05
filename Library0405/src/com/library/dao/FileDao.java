package com.library.dao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


import com.library.vo.Book;

public class FileDao implements Dao{

	//파일로부터 데이터를 읽어서 리스트로 반환합니다
	@Override
	public List<Book> getList() {
		
//		System.out.println("===fileDao.getlsit 시작===");
		//리스트 선언
		List<Book> booklist = new ArrayList<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader("booklist.txt"));) 
		{
			
			String str = "";
			//readLine() : 한줄씩 읽어 오고 읽어올 파일이 없으면 null을 반환합니다
			while((str=br.readLine()) != null) { // null값을 반환하면 반복문 탈출
				
				//문자열을 이용해서 Book 객체를 생성
				Book book = makeBook(str);
				//생성된 객체를 리스트에 저장
				if(book != null) {
					booklist.add(book);					
				}
				
			}
			
		} catch (FileNotFoundException e) {
//			e.printStackTrace();
			System.err.println(e.getMessage());
		} catch (IOException e1) {
//			e1.printStackTrace();
			System.err.println(e1.getMessage());
		}

//		System.out.println("===fileDao.getlsit 종료===");
		return booklist;
	}
	
	/**
	 * 읽어온 파일을 공백단위로 끊어 배열에 저장하고 book 객체를 생성
	 * @param str
	 * @return
	 */
	private Book makeBook(String str) {
		
		try {
			//공백을 기준으로 배열로 저장
			String[] strAyy = str.split(" ");
			
			//책을 생성하기 위해 알맞은 타입으로 저장
			/*
			 * 강제형변환시 오류가 발생할 수 있으므로 파일이 올바르지 않은 형태로
			 * 저장되어있을 경우 오류가 발생한다
			 * 프로그램에서 오류가 발생했을 때 프로그램이 비정상적으로 종료되는 것을
			 * 막기 위해서 예외처리를 해준다
			 */
			
			//문자열을 int 타입으로 변환
			int no = Integer.parseInt(strAyy[0]);
			String title = strAyy[1];
			String author = strAyy[2];
			boolean isRent = Boolean.parseBoolean(strAyy[3]); 
			
			//책 생성
			Book book = new Book(no,title,author,isRent);

			//책 반환
			return book;
			
		}catch(Exception e) {
			//문자열 파싱 중 오류가 발생했을 경우 메세지 처리, null 반환
			System.err.println(str+"파싱중 오류가 발생 하였습니다");
			return null;
			}

	}

	//책 등록
	/*
	 * 리스트를 매개변수로 받아 파일로 출력합니다
	 */
	@Override
	public boolean listToFile(List<Book> list) {
		
		try (FileWriter fw = new FileWriter("booklist.txt");) 
		{
			//리스트에 담긴 파일 정보를 출력합니다
			for(Book book : list) {
					fw.write(book.toString()+"\n");					
			}
			
			fw.flush();
			return true;
			
		} catch (IOException e) {
//			e.printStackTrace();
			System.err.println(e.getMessage());
		} catch (Exception e1) {
//			e.printStackTrace();
		System.err.println(e1.getMessage());
		}
		
		return false;
	}

	

	
	

}
