package com.jungang;

public class OperatorEx02 {

	public static void main(String[] args) {
		//논리연산자
		int x=10, y=5, z=3;
		
		//a &&(그리고) b : a항과 b항이 모두 true일때
		//x>y 10>5 true
		//x>z 10>3 true
		//=> true, 코드블럭 실행
		//& : 두 항 모두 연산하고 비교한다
		//&& : 첫번째 항이 false인 경우 두번째항은 확인하지 않는다
		if(x>y && x>z) {
			
		}
		//a ||(또는) b : a항 또는 b항 둘 중 하나가 true일때
		//x>y 10>5 true
		//x<z 10<3 false
		//=> true, 코드블럭 실행
		//| : 두 항 모두 연산하고 비교한다
		//|| : 첫번째 항이 true인 경우 두번째항은 확인하지 않는다
		if(x>y || x<z) {
			
		}
		
		
		//대입연산자
		//왼쪽의 값을 오른쪽에 대입
		x=10;
		x+=10; //x=x+10 x=20
		x*=10; //x=x*10 x=100
		x%=10; //x=x%10 x=0
		
		boolean t = true;
		t |= false; //true | false
		
		//삼항연산자
		//(조건)? 참:거짓
		//3개 이상의 피연산자를 필요로 하는 연산자
		int score =95;
//		String result = (score>90)?"A":"B"; //""사용으로 String 타입으로 선언
		String result = (score>90)?"A":(score>80)?"B":"C"; 
		System.out.println(result);
		
		
		
	}
	
	
	
}
