package getter.setter;

public class Person {
	
	static final double PI = 3.14159;
	static final double EARTH_RADIUS = 6400;
	
	
	//상수 : 한번 값이 정해지고 나면 수정이 불가능
	final String nation = "Korea";
	final String ssn;
	String name;
	
	Person(String ssn, String name) {
		this.ssn=ssn;
		this.name=name;
		
		//상수는 초기값 설정 후에는 값을 변경하는 것이 불가능
//		this.ssn="123456-1234567";
		this.name="정찬우";
	}
	
	

}
