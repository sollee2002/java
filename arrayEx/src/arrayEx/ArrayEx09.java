package arrayEx;

public class ArrayEx09 {

	public static void main(String[] args) {
		
		String[] names = new String[3];
		//new 연산자를 이용해 생성한 경우
		//메모리가 저장된 주소가 서로 다르기 때문에 같은 문자열이라도 다른 값으로 취급
		//이 경우 .equlas를 이용해 값 비교
		names[0]= new String("Java");
		names[1]= new String("Java");
	
		//리터럴 값의 경우 같은 문자열은 같은 값으로 취급
//		names[0]="Java";
//		names[1]="Java";
		names[2]="C#";
		
		//참조타입에서 == : 참조타입의 변수가 가지고 있는 주소 비교
		if(names[0]==names[1]) {
			System.out.println("0번방 == 1번방");
		} else {
			System.out.println("0번방 != 1번방");
		}

		//참조타입에서 .equals : 참조타입의 문자열 자체를 비교
		if(names[0].equals(names[1])) {
			System.out.println("0번방 == 1번방");
		} else {
			System.out.println("0번방 != 1번방");
		}
	}

}
