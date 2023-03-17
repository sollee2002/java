package bmiEx;

public class Operater {
	
	public static void main(String[] args) {
		byte byteValue = 10;
		byte byteValue2 = 20;
		
		//byte. short, char 타입은 연산시에
		//int 타입으로 변환되어서 연산되기때문에 int 타입이 반환된다
//		byte byteValue3 = byteValue+byteValue2;
		
		int byteValue3 = byteValue + byteValue2;
		byte byteValue4 = (byte)(byteValue + byteValue2);
		//연산값을 int 외 다른 형태로 반환하고 싶을 때 > 강제 타입 변환 이용
		//(타입)(연산)
		
		System.out.println(byteValue3);
		System.out.println(byteValue4);
		System.out.println("=================");
		
		//===============실수의 연산===================
		int iValue =10;
		double dValue =5.5;
		double result = iValue + dValue;
		//연산에 double형이 포함된 경우 double타입으로 자동 변환
		
		System.out.println(result);
		System.out.println((double)iValue);
		System.out.println("==================");
		//캐스팅 위치에 따라 다른 결과값 출력
		System.out.println(5/2);//그냥 연산은 int타입으로 반환되어 2.5가 아닌 2가 출력
		System.out.println((double)5/2);//double로 타입을 변환하여 2.5 출력
		System.out.println(5/(double)2);
		System.out.println((double)(5/2));//연산된 값을 double로 타입을 변환하여 2.0 출력
		
		//=====문자열을 기본타입으로 강제 타입변환하는 방법
		//int 변환***
		String str = "3000";
		
		//parseInt(String s) : int
		//string 타입의 매개변수를 넣고 실행결과 int타입을 반환 받는다
		int i = Integer.parseInt(str);
		System.out.println("===================");
	    System.out.println("int "+i);
	    System.out.println("int "+(i+100));//i가 어느타입 변수인지 +연산을 통해 추측 가능
	    
//		String str2 = "문자열";
//		int i2 = Integer.parseInt(str2);
//	    System.out.println(i2);
	    
//	    Exception in thread "main" java.lang.NumberFormatException: For input string: "문자열" <<에러 제목
//	    	at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
//	    	at java.base/java.lang.Integer.parseInt(Integer.java:668)
//	    	at java.base/java.lang.Integer.parseInt(Integer.java:786)
//	    	at bmiEx/bmiEx.Operator.main(Operator.java:44)<<에러 발생 위치
	    
	    //byte 변환
	    str="10";
	    byte i2 = Byte.parseByte(str);
	    System.out.println("byte "+i2);
	    
	    //short 변환
	    str="200";
	    short i3 = Short.parseShort(str);
	    System.out.println("short "+i3);
	    
	    //long 변환
	    str="40000000";
	     long i4 = Long.parseLong(str);
	     System.out.println("long "+i4);
	     
	    //float 변환
	     str="12.345";
	     float i5 = Float.parseFloat(str);
	     System.out.println("float "+i5);
	     
	     //double 변환***
	     str="12.345";
	     double i6 = Double.parseDouble(str);
	     System.out.println("double "+i6);
	     
	     //boolean 변환
	     str = "true";
	     boolean i7 = Boolean.parseBoolean(str);
	     System.out.println("boolean "+i7);
	     
	     
	     //======문자열을 기본타입으로 강제 변환
	     String Value = String.valueOf(123);
	     System.out.println(Value);
	     System.out.println(String.valueOf(1.23));
	     System.out.println(String.valueOf(true));
	     System.out.println(String.valueOf('가'));
	     
	     
//		2-3 확인문제 9		  
//	    long var1=2L;
//	    float var2=1.8f;
//	    double var3=2.5;
//	    String var4="3.9";
//	    int result2=(int)(var1+var2+var3+((int)Double.parseDouble(var4)));
//	    System.out.println(result2);
	   
	
	
	
	
	
	}

	
}
