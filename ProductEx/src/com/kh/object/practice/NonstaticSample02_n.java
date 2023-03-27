package com.kh.object.practice;

public class NonstaticSample02_n {
	
	//로또
	//1에서 45까지의 임의의 정수 출력
	//중복제거
	public void printLottoNumbers() {
		int[] lotto = new int[6];
		int temp;//방을 바꿀때 필요한 저장공간을 생성v.g/
		
		for(int i=0; i<lotto.length; i++) {
			
			lotto[i]=(int)((Math.random()*45)+1);
			
			for(int j=0; j<i; j++) { //동일한 숫자가 입력되었는지 체크
				if(lotto[i]==lotto[j]) {
					i--;
				}
			}
		}
		
		for(int i=0; i<lotto.length; i++) { //순서대로 정렬하기
			for(int j=0; j<i; j++) {
				if(lotto[i]<lotto[j]) {
					temp = lotto[j];
					lotto[j]=lotto[i];
					lotto[i]=temp;
				}
			}
		}
		
		
		for(int i=0; i<lotto.length; i++) {
			System.out.print(lotto[i]+" ");
		}
		System.out.println();
	}
	
	//수만큼 문자출력
	public char outputCahr(int num,char c) {
		
		for(int i=0; i<num; i++) {
			System.out.print(c+" ");
		}
		System.out.println();
		return ' ';
	}
	
	//무작위 알파벳
	public char alphabette() {
		//아스키코드 65~90 까지 영어대문자
		//아스키코드 97~122 까지 영어소문자
		//0 <= A <1
		//65 <= A <122 //122포함 안됨
		//65 <= A <123 <--랜덤범위
		
		while(true) {
			int A =(int)((Math.random()*58)+65);
			if(A<=90 || A>=97) {
				System.out.println((char)A);
				break;
			}
		}
		return ' ';
	}
	
	//문자열 끊기
	public String mySubString(String str, int index1, int index2) {
		//문자열의 인덱스값을 이용하여 문자열을 추출
		//시작인덱스는 포함하고 끝 인덱스는 불포함
		//특정 문자열을 추출하는 방법
		//String.substring(index1,index2);
		//원하는 위치의 문자열을 추출하여 반환해주므로
		//원본은 수정되지 않는다
		System.out.println("입력받은 문자열 : "+str);
		System.out.println("입력받은 문자열의 길이 : "+str.length());
		System.out.printf("입력받은 인덱스 : (%d, %d)\n",index1,index2);
		System.out.println("출력된 문자열 : "+str.substring(index1-1, index2));
		
		return "";
	}
	
	

}
