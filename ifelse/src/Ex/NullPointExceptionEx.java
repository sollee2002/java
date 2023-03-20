package Ex;

public class NullPointExceptionEx {

	public static void main(String[] args) {
		//null :참조타입의 변수가 아무것도 참조하고 있지 않을때
		//Scanner s = null; <-참조변수가 null 값을 가지고 있으면 참조할 변수가 없다는 의미
		//NullPointException 에러 발생
		//if문을 사용해 오류 해결 가능
		
		//. : 주소접근자, 객체접근연산자
		//. 이후 객체가 가지고 있는 접근가능한 필드, 메소드 목록을 보여준다
		//필드, 메소드 : .을 통해 접근 가능
		//변수이름.필드명
		//변수이름.메소드명(매개변수);
		
		String name = null; //초기값으로 null을 입력 -> 참조변수가 아무런 객체도 참조하고 있지 않다는 의미
//		System.out.println("총 문자수 : "+name.length());//변수이름.lenght():문자열의 총 길이를 반환
		// -> 참조변수의 객체가 없기 때문에 "NullPointException" 오류 발생
		
		name="안녕"; //값을 초기화하면 if문이 정상적으로 실행됨
		
		if(name!=null) { //name의 값이 null이 아닐때 실행 //NullPointException 오류 방지
			System.out.println("총 문자수 : "+name.length());//변수이름.lenght():변수의 총 길이를 반환			
		}
		
		System.out.println("정상적으로 종료되었습니다");
		
		//NullPointException 오류 해결방안
		//1. 참조변수의 객체가 null값이 아니도록 초기화
		//2. if문을 이용하여 참조변수의 객체값이 null인 경우 실행되지 않도록
		
		//new 연산자를 이용하여 객체를 생성할 경우 리터럴 값이 같아도 힙 영역에 각각 객체를 생성함
		//new 연산자를 만나면 인스턴스화 되어 힙 영역에 객체 생성
		//String name1 = new String("신용권");
		//String name2 = new String("신용권");
		//같은 문자열을 가지고 있으나 저장된 주소값이 달라 t/f를 비교하면 false값 반환
		
		//문자열(참조변수)의 리터럴(값)이 동일한 경우 객체의 주소값 공유
		//String name1 = "신용권";
		//String name2 = "신용권";
		//리터럴이 동일함으로 같은 객체에 저장
		
		//String name1 = "신용권";
		//String name2 = "신용권";
		//String name3 = new String "신용권";
		//name1 == name2 : true
		//name1 == name3 : false
		//name1, name2, name3에 저장된 값은 모두 같지만 name3은 새로운 객체를 만들어 저장했기 때문에
		//name1과 name2는 같은 객체에, name3는 같은 값이나 다른 객체에 주소를 저장한다
		//따라서 name1과 name2는 같은 값, name1과 name3는 다른 값으로 인식한다
		

		//메모리 사용 영역
		//메소드 영역, 힙 영역, 스택 영역으로 구분
		//메소드 영역 : 코드가 올라가며 실행을 담당
		//힙 영역 : 객체(주소) 생성
		//스택 영역 : 변수 생성
		
		//번지 비교
		//비교연산자가 기본 타입에서 사용되면 값을 비교
		//비교연산자가 참조 타입에서 사용되면 번지(주소)를 비교
	}

}
