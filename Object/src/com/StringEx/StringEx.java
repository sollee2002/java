package com.StringEx;

import java.io.UnsupportedEncodingException;

public class StringEx {

	public static void main(String[] args) throws UnsupportedEncodingException {
		
		String str = "hello";
		byte[] byteAyy = str.getBytes(); //str객체가 가지고 있는 값을 byte[]로 반환
		byte[] byteAyy2 = {67,68,69};
		
		//byte 배열을 String 문자열로 변환
								//배열, 시작인덱스, 갯수
		String str2 = new String(byteAyy,2,2);
		String str3 = new String(byteAyy2);
		
		System.out.println(str2); //hello --> 'll' 출력
		System.out.println(str3);
		
		
		//실습파일 열었을 때 문자가 깨졌던 현상
		//문자코드가 일치하지않는 경우 꺠질 수 있습니다
		// euc-kr, ms949 한글 표현시 2바이트 사용
		//utf-8 		 한글 표현 시 3바이트 사용
		
		
		byte[] b = str3.getBytes("euc-kr");
		String s_euckr = new String(b,"euc-kr");
		String s = new String(b);
		System.out.println(s_euckr);
		System.out.println(s);
		
		String str4 = "반갑습니다. 오늘도 힘내세요.";

		byte[] b4 = str4.getBytes("euc-kr");
		String s_euckr4 = new String(b4,"euc-kr");
		String s4 = new String(b4);
		System.out.println(s_euckr4);
		System.out.println(s4);
		
		
		
	}
	
	
	
}
