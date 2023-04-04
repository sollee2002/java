package com.chap04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.chap03.Book;

public class FileDao {
	
	public static void main(String[] args) {

		FileDao dao = new FileDao();
		
		dao.fileSava();
		dao.fileRead();
		
		
	}
	
	/**
	 * 파일을 읽어서 책 리스트를 생성
	 */
	public void fileRead() {
		
		List<Book> list = new ArrayList<>();
		System.out.println("책 리스트 정보를 읽어옵니다");
		
		try (BufferedReader br = new BufferedReader(new FileReader("booklist.txt")))
		{
			String str = "";
			while((str=br.readLine()) != null) {
				//공백으로 끊어서 배열에 답습니다
				String[] strAyy = str.split(" ");
				
				//책 생성하는데 필요한 파라미터
				int no = Integer.parseInt(strAyy[0]);
				String title = strAyy[1];
				String author = strAyy[2];
				boolean isreturn  = Boolean.parseBoolean(strAyy[3]);
				
				//책 생성
				Book book = new Book(no,title,author,isreturn);
				//리스트에 담아줍니다
				list.add(book);
				
			}
			
			System.out.println("생성된 리스트를 출력합니다");
			for(Book book : list) {
				System.out.println(book.toString());
			}
			
			br.close();
			System.out.println("파일 출력 완료");
				
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	/**
	 * 리스트에 담겨 있던 책의 정보를 출력
	 */
	public void fileSava() {
		//데이터 생성
		List<Book> list = new ArrayList<>();
		
		list.add(new Book(1,"책1","작가1",false));
		list.add(new Book(2,"책2","작가2",false));
		list.add(new Book(3,"책3","작가3",false));

		//파일 출력
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("booklist.txt")))
		{
			for(Book book : list) {
				//콘솔출력
				bw.write(book.toString());
				bw.newLine();
			}
			
			bw.flush();

			System.out.println("파일 생성 완료");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
