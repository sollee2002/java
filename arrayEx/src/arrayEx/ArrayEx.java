package arrayEx;

public class ArrayEx {

	public static void main(String[] args) {
		//배열
		//같은 타입의 데이터를 연속된 공간에 나열하고 인덱스를 부여한 자료구조
		//※같은 타입만 저장이 가능
		//※한번 생성된 배열의길이를 늘이거나 줄일 수 없다
		//※배열의 길이를 확인하는 방법 : 변수명.lenght
		//						  =항목의 갯수
		
		//배열의 선언
		int intArray[];//int타입의 값만 들어올 수 있다
		int[] intArray2 = {90,80,60,85,50,60,75,95,80,100}; //중괄호를 통해 배열 선언과 동시에 값의 초기화가 가능
		
		//배열의 값을 참조하는 방법
		//배열이름[index]
		
		//변수이름.lenght; : 배열의 길이를 반환
		//():메소드, 없을 경우 필드
		System.out.println("배열길이:"+intArray2.length);
		
		//i = 0~9
		int sum =0;
		
		//배열은 인덱스가 0부터 시작하기 때문에 배열의 길이보다 작게 설정해야 정상적으로 출력
		for(int i=0; i<intArray2.length; i++) {
			System.out.printf("[%d] %d\n",i,intArray2[i]);
			sum += intArray2[i];
		}
		System.out.println("점수 총 합계 : "+sum);
		System.out.println("평균 : "+sum/intArray2.length);
	}

}
