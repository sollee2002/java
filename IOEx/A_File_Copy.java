
package com.chap01;

import java.io.File;
import java.io.IOException;

public class A_File {
	
	public static void main(String[] args) {
		//객체생성
		A_File a = new A_File();
		//메소드 실행 : 레퍼런스변수에 주소접근연산자(.)을 이용합니다
//		a.method01();
		a.method02();
		

	}
	
	public void method02() {
		File file = new File("d:/test/test.txt");
		File dir = new File("d:/test");
		
		System.out.println("파일명: "+file.getName());
		System.out.println("절대경로: "+file.getAbsolutePath());
		System.out.println("상대 경로: "+file.getParent());
		System.out.println("파일 용량: "+file.length());
		System.out.println("파일 존재 여부: "+file.exists());
		
		try {
			//경로상 한개의 디렉토리 생성
			dir.mkdir();
			//경로내의 디렉토리가 여러개 생성 되어야 할 경우
//			dir.mkdirs();
			//파일 생성
			file.createNewFile();			
		} catch (IOException e) {
		System.out.println(e.getMessage());
		e.printStackTrace();
		}
		
	}

	private void method01() {
		//경로를 지정하지 않으면 현재 프로젝트 폴더에 파일을 생성합니다
		//메모리 상에만 존재
		File file = new File("test.txt");
		
		System.out.println("파일명: "+file.getName());
		System.out.println("절대경로: "+file.getAbsolutePath());
		System.out.println("상대 경로: "+file.getParent());
		System.out.println("파일 용량: "+file.length());
		System.out.println("파일 존재 여부: "+file.exists());
		
		//실제 파일 생성
		try {
			file.createNewFile();
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		
	}
	
	
	
	

}
