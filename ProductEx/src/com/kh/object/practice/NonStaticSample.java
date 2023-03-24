package com.kh.object.practice;

public class NonStaticSample {

	public void printLottoNumbers() {
		
		//배열값 정렬
		//방을 바꾸기 위해 새로운 변수를 선언하고 이용합니다
		
		//문자열 끊기
//		String str;
//		System.out.println(str.length());
//		System.out.println(str.substring(1, 4));//차만큼의 문자열이 출력
//		시작인덱스, 끝인덱스
//		시작인텍스는 포함, 끝인덱스는 포함하지 않음
		
		int Lotto[] = new int[6];
		int temp;
		System.out.println("[Lotto]");
		
		//로또 추첨
		for(int i=0; i<Lotto.length; i++) {
			Lotto[i] = ((int)(Math.random()*45)+1);
			
			
			for(int j=0; j<i; j++) {
				if(Lotto[i]==Lotto[j]) {
					i--;
					break;
				}
			}
		}
		
		//오름차순 정렬
		for(int i=0; i<Lotto.length; i++) {
			for(int j=0; j<i; j++) {
				if(Lotto[i]<Lotto[j]) {
					temp = Lotto[i];
					Lotto[i] = Lotto[j];
					Lotto[j] = temp;
				}
			}
		}

		//추첨된 로또 출력
		for(int i=0; i<Lotto.length; i++) {
			System.out.print(Lotto[i]+" ");
		}
		System.out.println();
	}
	
	public void outputChar(int num, char c) {
		
		System.out.println("[문자"+c+" "+num+"개 출력]");
		for(int i=0; i<num; i++) {
			System.out.print(c+" ");
		}
		System.out.println();
		
	}
	
	public char alphabetter() {
		//아스키코드 65~90 까지 영어대문자
		//아스키코드 97~122 까지 영어소문자
		
		char num1 = (char)((int)(Math.random()*25)+65);
		char num2 = (char)((int)(Math.random()*25)+97);
		
		System.out.println("무작위 알파벳 대문자> "+num1);
		System.out.println("무작위 알파벳 소문자> "+num2);
		
		
		return 'a';
	}
	
	public String mySubstring(String str, int index1, int index2) {
		
		System.out.println("[문자열 출력]");
		System.out.println(str.substring(index1, index2));
		return str;
	}
	
	
	
	
	
	
	
	

}
