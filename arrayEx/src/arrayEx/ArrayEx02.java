package arrayEx;

public class ArrayEx02 {

	public static void main(String[] args) {
		//배열 생성
		int[] score = {90,5,10};
		String names[] = {"신용권","홍길동","감자바"};
		
		//반복문을 이용해서 배열에 입력된 값 출력
		//초기화식; 조건식; 증감식
		//변수명.length : 배열의 값의 갯수
		
//		int i=0;
//		i.length; //변수의 값을 0으로 초기화했기때문에 값의 갯수를 반환할 수 없음
		
		for(int i=0; i<names.length; i++) {
			//배열의 값에 접근 : 변수이름[방번호]
			System.out.println(names[i]);
		}
		
		

	}

}
