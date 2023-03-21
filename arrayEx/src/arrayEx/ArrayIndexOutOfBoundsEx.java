package arrayEx;

public class ArrayIndexOutOfBoundsEx {

	public static void main(String[] args) {
		//배열 선언
		//int score[] = {10, 20, 30}; //[0][1][2]
		
		//배열을 선언한 후 중괄호를 사용해서 값을 입력하면 오류가 발생
		int score2[];
		//score2 = {10, 20, 30};//<--오류발생
		//배열선언 후 생성하는 방법 1
		//변수명 = new 타입[] {};
		score2 = new int[] {10, 20, 30}; 
		int sum=0;
		
		//배열 선언 후 생성하는 방법 2
		//값이 목록에 없지만 미리 배열을 만드는 경우
		int[] score = new int[10]; //10만큼의 배열의 길이 설정
		//타입[] 변수 = new 타입 [길이]
		System.out.println("int타입을 저장할 새로운 10개의 저장공간을 만들었어요!");
		
		//초기화식; 조건식; 증감식
		for(int i=0; i<10; i++) {
//			System.out.printf("[%d] %d\n",i,score2[i]);
//			sum += score2[i];
			System.out.println(score);
		}
//		System.out.println("합계: "+sum);
//		System.out.println("평균: "+sum/score2.length);
		
		
		//java.lang.ArrayIndexOutOfBoundsException
		//배열의 index를 초과하는 방번호가 입력된 경우
		//배열의 index는 0부터 시작한다
		//배열의 총 길이는 갯수를 반환(1부터 시작)
		//int sum = score[3];//<--존재하지않는 index를 참조해서 오류
		
	}

}
