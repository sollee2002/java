package bmiEx;

public class mondai2_3 {
	
	public static void main(String[] args) {
		//6번
		//변수 선언
		int x = 5;
		int y = 2;
		int result6 = x/y;
		System.out.println("6번======"+result6);
		//5/2=2.5이나 result6의 타입이 int이므로 정수인 2만 출력
		
		//7번
		//6번 문제에서 값을 2.5로 출력
		double result7 = (double)x/y;
		System.out.println("7번======"+result7);
		
		//8번
		double v1 = 3.5;
		double v2 = 2.7;
		int result8 = (int)(v1+v2);
		System.out.println("8번======"+result8);
		
		
		//9번
		//변수 선언
		long var1=2L;
		float var2=1.8f;
		double var3=2.5;
		String var4="3.9";
		
		//long float double 변수 int 강제변환
		//String 변수 Double로 강제변환
		//double로 변환한 var4를 int 형태로 정수만 출력
		int result9 = (int)((var1+var2+var3)+(int)(Double.parseDouble(var4)));
		System.out.println("9번======"+result9);//9출력
		
		int i = (int)var1;
		int j = (int)(var2+var3);
		int k = (int)Double.parseDouble(var4);
		System.out.println(i+j+k);
		
		//10번
		String str1 = 2+3+"a"; //5a
		String str2 = 2+"a"+3; //2a3
		String str3 = "a"+2+3; //a23
		String str4 = "a"+(2+3); //a5
		System.out.println("10번=====");
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		
		//11번
		byte value = Byte.parseByte("10");
		int value2 = Integer.parseInt("1000");
		float value3 = Float.parseFloat("20.5");
		double value4 = Double.parseDouble("3.1459");
		System.out.println("11번=====");
		System.out.println(value);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		
	}

}
