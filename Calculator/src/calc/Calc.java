package calc;

public class Calc {
	
	public static void main(String[] args) {
		System.out.println("객체생성");
		Calc c = new Calc();
		c.execute();
	}
	
	//실행메소드
	public void execute() { 
		System.out.println("exesute start");
		double res = avg(7,10);
		System.out.println("exesute");
		System.out.println(res);
	}
	
	private int plus(int i, int j) {		
		System.out.println("plus stat");
		return i+j;
	}

	private double avg(int i, int j) {
		System.out.println("avg start");
		int sum = plus(i,j);
		System.out.println("avg");
		return sum/2.0;
	}
	

}
