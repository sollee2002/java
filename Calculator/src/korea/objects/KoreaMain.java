package korea.objects;

public class KoreaMain {

	public static void main(String[] args) {
		//코드선택후 F3 -> 실행되는 코드가 있는 곳
		
		//객체 초기화
		Korean k = new Korean();//기본생성자 호출
		k.name = "전지현";
		k.ssn=  "222222-2222222";
		
		Korean hong = new Korean("홍길동","123456-1234567");//생성자 호출
		Korean lee = new Korean("이하늬","111111-2222222");//생성자 호출
		
		System.out.printf("[korean] \n이름: %s \n주민등록번호: %s \n",k.name,k.ssn);
		System.out.printf("[hong] \n이름: %s \n주민등록번호: %s \n",hong.name,hong.ssn);
		System.out.printf("[lee] \n이름: %s \n주민등록번호: %s \n",lee.name,lee.ssn);

	}

}
