package com.chap02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 보조스트림 
 * 	-기반 스트림(Input,OutputStream, Reader/Writer)과 연결되어
 * 	여러가지 편리한 기능을 제공해주는 스트림을 말한다.
 * 	-단독으로 외부 매체(파일, 네트워크, 키보드, 모니터 등)와 데이터를 직접 주고받을 수 있다.
 * 	-기반 스트림을 먼저 생성하고 보조 스트림을 연결해 주어야 한다.
 * 
 * 성능향상 보조 스트림
 * 	-기반 스트림의 속도를 향상시켜주는 기능을 한다
 * 	-기반 스트림에 대한 레퍼런스가 필요하다
 * 	-버퍼라는 공간을 사용해서 속도 향상에 도움을 준다
 * 	 (버퍼라는 공간에 데이터를 쌓아 놨다가 한번에 입/출력 시킨다.
 * 	-기반 스트림에서 제공하지 않는 메소드 newLine(), readLine()들을 제공해 준다
 */
public class A_BufferedStream {
	
	public static void main(String[] args) {
		A_BufferedStream ab = new A_BufferedStream();
		
		ab.fileSave();
		ab.fileRead();
		
		
	}
	
	public void fileRead() {
		
		//보조스트림은 단독사용 불가
		//기반스트림을 생성자의 매개변수로 넣어줘야한다
		try (BufferedReader br = new BufferedReader(new FileReader("c_Buffer.txt")))
		{
			String str = "";
			//기반 스트림에서 제공하지 않는 메소드
			//파일에사 한 줄을 읽어올 때 사용한다
			while((str=br.readLine()) != null) {
				System.out.println(str);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void fileSave() {
		//true: 이어서 작성 <-- 실행할때마다 추가
		//false: 덮어쓰기 (기본값) <-- 덮어쓰기 되어서 입력값만 출력
		try (FileWriter fw = new FileWriter("c_Buffer.txt",true);
			 BufferedWriter bw = new BufferedWriter(fw);
//			 BufferedWriter bw = 
//				new BufferedWriter(new FileWriter("c_Buffer.txt",true));
			) {
			
			bw.write("안녕하세요");
			bw.newLine(); //줄바꿈
			bw.write("대답을 잘해주세요~");
			
			bw.flush();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
