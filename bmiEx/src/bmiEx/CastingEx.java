package bmiEx;

public class CastingEx {
	
	public static void main(String[] args) {
		
		int iValue = 65;
//		char charValue = iValue; //int타입이 char타입보다 용량이 크기 때문에 자동 형변환 되지 않음
		char charValue = (char)iValue;
		
		System.out.println(iValue);
		System.out.println(charValue);
		
		long longValue = 500; //자동 형변환 되어서 l 붙이지 않음
//		iValue = longValue; //long타입이 int타입보다 용량이 크기 때문에 자동 형변환 되지 않음
		iValue = (int)longValue;
		
		System.out.println("===========");
		System.out.println(iValue);
		
		float fValue = 3.14f;
		iValue = (int)fValue;
		
		System.out.println("============");
		System.out.println(iValue);
		
		//-128~127 범위가 초과되면 로테이션이 일어남
		//변환 하려는 타입에 들어갈 수 있는 값인지 확인 필수
		//강제 형변환 시 주의
		int intValue = 128;
		byte byteValue = (byte)intValue;
		
		System.out.println("============");
		System.out.println(intValue);
		System.out.println(byteValue);
		
	}

}
