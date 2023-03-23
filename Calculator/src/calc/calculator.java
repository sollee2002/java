package calc;

public class calculator {
	
	//true: 켜짐 , false: 꺼짐
	boolean powerOn; //초기값: false
	
	/**
	 * 전원을 키거나 끕니다
	 */
	public void PowerOn() {
		
		if(powerOn) { //초기값이 false이기 때문에
			powerOn=false;
			System.out.println("계산기의 전원을 끕니다");
		} else {
			powerOn=true;
			System.out.println("계산기의 전원을 킵니다");			
		}
		
	}
	
	public int add(int x, int y) {
		if(powerOn) {
			return x+y;			
		} else {
			System.out.println("계산기를 실행해주세요");
			return 0;
		}
	}
	

	public int add(int[] numbers) {
		int sum = 0;
		for(int num : numbers) {
			sum += num;
		}
		return sum;
	}
	
	//...과 []는 같은 타입으로 인식
	//...도 배열로 값을 받음
	public int addFn(int ... num) {
		
		int numbers = 0;
		for(int sum : num) {
			numbers += sum;
		}
		return numbers;
		
	}
	
	
	
}
	
