package objects;

public class CalculatorMain {
	
	public static void main(String[] args) {
		//타입(클래스명) 변수명 = new 타입(클래스명) ();
		Calculator cal = new Calculator();
		int result = cal.add(2, 5);
		System.out.println("두 수의 합: "+result);
		
	}

}
