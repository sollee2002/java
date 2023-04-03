package com.chap01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileByteStreamEx {
	
	public static void main(String[] args) {
		
		FileByteStreamEx ex = new FileByteStreamEx();
		
		ex.fileSave(); //파일 저장
		ex.fileRead(); //저장된 파일 출력
	}
	
	public void fileRead() {
		System.out.println("파일 출력 실행");
		//사용한 자원을 닫아주기 위해서 상단에 선언합니다
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("a_byte.dat");
			
			/*
			 *파일로부터 데이터를 읽어올때는 read() 메소드를 사용하면 된다
			 *하지만 실제로 파일에는 얼마만큼의 데이터가 있는지 모른다
			 *read() 메소드는 더이상 읽어올 데이터가 없으면 -1을 리턴한다
			 *따라서 반복문을 사용해서 read() 메소드에서 -1이 리턴되기 전까지
			 *데이터를 읽어오면 된다
			 */
			
			int value = 0;
			value = fis.read();
			System.out.println(value);
			
			//데이터를 읽어서 value 변수에 저장
			//-1 : 데이터의 끝
			while((value=fis.read()) != -1) {
				System.out.print((char)value);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}
	}
	
	public void fileSave() {
		System.out.println("파일 저장 실행");
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream("a_byte.dat");
			try {
				fos.write(97); //a저장
				fos.write('b'); //b저장
				fos.write(10); //줄바꿈
//				fos.write('한'); //문자열기반 아닌 바이트 기반이라 한글 출력 x
				
				byte[] byteArray = {'a','b','c','d'};
				fos.write(byteArray);
				fos.write(10); //줄바꿈
				fos.write(byteArray, 1, 2); //배열, 시작인덱스, 갯수
				
				fos.flush();
			
				
			} catch (IOException e) {
				e.printStackTrace();
			} 
			} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			//사용중인 자원이 있다면 종료시켜줍니다
			if(fos != null) {
				try {
					//스트림을 이용했으면 닫아주어야 합니다
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
