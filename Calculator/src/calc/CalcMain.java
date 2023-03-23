package calc;

public class CalcMain {

	public static void main(String[] args) {
		calculator calc = new calculator();
		
		calc.PowerOn();
		//매개변수 타입과 갯수가 일치하지 않으면 오류
		//이름이 다른 경우 오류
		int res = calc.add(5, 4);
		System.out.println(res);
		//계산기의 전원을 킵니다
		//9
		
//		int res = calc.add(5, 4);
//		System.out.println(res);
		//계산기를 실행해주세요
		//0

		//배열을 생성 후 메서드에 파라메터로 전달
		int[] numbers = {1,2,3,4,5};
		int num = calc.add(numbers);
		System.out.println("calc.add(numbers): "+num);
		
		//메서드를 실행할 때 배열을 생성
		System.out.println("calc.add(new int[] {1,2,3}): "+calc.add(new int[] {1,2,3}));
	
		System.out.println("calc.addFn(1,2,3,4,5,6,7): "+calc.addFn(1,2,3,4,5,6,7));
	
	
	
	}

}
