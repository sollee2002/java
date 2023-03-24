package getter.setter;

import java.util.Calendar;

public class PersonMain {
	
	public static void main(String[] args) {
		
		Person p = new Person("123456","홍삼원");
		
		//상수 필드의 값을 변경할 수 없다
		//p.nation="한국"; <-- 컴파일 오류 발생
		p.name="홍사원";		
		
		System.out.println("파이값: "+Person.PI);
		System.out.println("지구반지름: "+Person.EARTH_RADIUS+"km");
		
		//싱글톤 방식으로 구현
		Calendar cal = Calendar.getInstance();
		//현재 날짜(일) 출력
		int day = cal.get(Calendar.DATE);
		System.out.println(day+"일");
		
		//현재 연도 출력
		System.out.println(cal.get(Calendar.YEAR)+"년");
		//현재 시간 출력
		System.out.println(cal.get(Calendar.HOUR_OF_DAY)+"시");
		//현재 분 출력
		System.out.println(cal.get(Calendar.MINUTE)+"분");
		//현재 초 출력
		System.out.println(cal.get(Calendar.SECOND)+"초");
		
		//실행전
		long before = System.currentTimeMillis();
		long after = System.currentTimeMillis();
		
		
	}

}
