package objectEx;

public class Key {
	
	public int number;
	public String str;
	
	public Key(int number) {
		this.number=number;
	}

	@Override
	public boolean equals(Object obj) {
		//매개변수 obj가 key로 형변환 가능한지 확인
		//가능하면 형변환 number값 비겨
		//불가능하면 false 리턴
		
		if(obj instanceof Key) {
			Key key = (Key)obj;
			if(this.number== key.number) {
				return true;
			}
		}
		
		return false;
	}
	
	@Override
	public int hashCode() {
		//객체의 주소값을 숫자로 반환
		//생성된 객체마다 다른 주소값을 가지고 있다
		//super.hashCode()
		
//		return str.hashCode(); //문자열 객체 비교 경우
		return number;
		
	}
	
}
