package korea.objects;

public class Korean {
	//필드
	
	String nation = "대한민국";
	String name;
	String ssn;
	
	
	//**[생성자의 오버로딩]
	//매개변수를 달리하는 생성자 여러개 선언
	//기본생성자
	public Korean() {
		
	}
	
	public Korean(String n, String s) {
		//필드 초기화
		name=n;
		ssn=s;
	}
	//******************
}
