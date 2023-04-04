package com.chap02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIO {
	public static void main(String[] args) {
		
		FileIO io = new FileIO();
		
		io.fileIOCopy();
		io.fileCopy();
	}

	/**
	 * A_File.java 파일을 읽어서
	 * 복사본 A_File_Copy.java를 생성합니다
	 */
	public void fileIOCopy() {
		
		long StartTime, endTime;
		StartTime=System.currentTimeMillis();
		
		File file = new File("d:\\work\\IOEx\\src\\com\\chap01\\A_File.java");
		if(!file.exists()) {
			System.out.println("파일이 존재하지 않습니다");
			return;
		}
		try (
				
			FileInputStream fis 
			= new FileInputStream(file);
			FileOutputStream fos 
			= new FileOutputStream("d:\\work\\IOEx\\src\\com\\chap01\\A_File_Copy.java");
				
			) {
				
//			int value = 0;
			byte[] byteArr = new byte[100];

//			while((value=fis.read()) != -1) {
//				fos.write(value);
//			}
			int i = 0;
			//i 바이트 배열에 읽어온 갯수를 반환합니다
			while((i=fis.read(byteArr)) != -1) {
				//읽어온 갯수만큼 출력합니다
				//마지막 출력할때 배열의 갯수를 다 채우지 못하면 이전에 덮어쓰기
				//되었던 값이 그대로 출력된다
				//안녕하세요|잘가000| ---> 잘가하세요 (출력오류)
				fos.write(byteArr,0,i);
			}
				
			fos.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		endTime = System.currentTimeMillis();
		System.out.println("소요시간 : "+(endTime-StartTime));
	}
	
	
	/**
	 * <파일 복사> - 복사할 파일 준비
	 * FileInputStream로 파일 읽어와서 FileOutputStream으로 저장
	 */
	public void fileCopy() {
		//파일 복사하기
		
		long StartTime, EndTime;
		
		StartTime = System.currentTimeMillis();
		
		
		try (
			
			FileInputStream fis 
			= new FileInputStream("D:\\work\\13_1_컬렉션프레임워크.pptx");
			FileOutputStream fos 
			= new FileOutputStream("D:\\work\\13_1_컬렉션프레임워크_Copy.pptx");
			
			) {
			
			byte[] byteArr = new byte[1000]; 
			//바이트 배열의 값이 클수록 처리속도 빠름
			//16000(기존)->180(배열[100]선언)->24(배열[1000]선언)
			int i = 0;
			while((i=fis.read(byteArr)) != -1) {
				fos.write(byteArr,0,i);
			}
			                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
			fos.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		EndTime = System.currentTimeMillis();
		System.out.println("소요시간: "+(EndTime-StartTime));
	}
	
	
}
