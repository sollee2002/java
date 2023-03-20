package Ex;

public class Dowhile {

	public static void main(String[] args) {
		//while문은 조건이 일치 할 때만 실행합니다
		int i =10;
		while(i<0) {
			System.out.println("0보다 작습니다");
		}
		
		//do while 문은 코드블럭을 실행하고 조건을 판단합니다
		//결과적으로 코드블럭은 1회 무조건 실행
		do {
			System.out.println("do-while문은 코드블럭을 무조건 실행합니다");
			System.out.println("1회 실행 후 조건문이 참일때까지 반복합니다");
		}
		while(i<0); { //참일 수 없는 조건이지만 do 사용을 통해 1회 실행
			System.out.println("0보다 작습니다/do-while");			
		}
	}

}
