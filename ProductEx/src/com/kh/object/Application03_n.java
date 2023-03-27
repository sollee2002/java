package com.kh.object;

import java.util.Scanner;

import com.kh.object.practice.NonstaticSample02_n;

public class Application03_n {
	
	public static void main(String[] args) {
		
		NonstaticSample02_n nons = new NonstaticSample02_n();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("[LOTTO]");
		nons.printLottoNumbers();
		
		System.out.println("[문자출력]");
		System.out.println("반복할 횟수> ");
		int num = sc.nextInt();
		System.out.println("반복시킬 문자> ");
		char alpha = sc.next().charAt(0);
		nons.outputCahr(num, alpha);
		
		System.out.println("[무작위 알파벳]");
		nons.alphabette();
		
		System.out.println("[문자열 끊기]");
		System.out.println("문자열 입력> ");
		String str=sc.next();
		System.out.println("시작할 인덱스> ");
		int i1 = sc.nextInt();
		System.out.println("끝 인덱스> ");
		int i2 = sc.nextInt();
		nons.mySubString(str, i1, i2);
	}
	

}
