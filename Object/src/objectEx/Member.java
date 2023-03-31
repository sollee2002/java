package objectEx;

public class Member {
	
	/* hashCode()
	 * 객체를 식별하는 하나의 정수값
	 * Object 클래스의 객체 해시코드 메소드는 객체 미모리 번지를 이용하여
	 * 해시코드를 만들어 리턴합니다
	 * ====> 객체마다 다른 값을 가집니다
	 * 
	 * 두 객체가 동등한지 비교하는데 사용되어집니다
	 */
	private String id;
	
	public Member(String id) {
		this.id=id;
	}
	
	public static void main(String[] args) {
		
		Member mem1 = new Member("id");
		Object obj = new Object();
		obj.equals(new String ("안녕"));
		
		obj.equals(obj);
		
		System.out.println("hashcode*****************");
		System.out.println(mem1.hashCode());
		//16진수로 변환
		System.out.println("16진수 변환*****************");
		String str = Integer.toString(mem1.hashCode());
		System.out.println(str);
		str.equals(str);
		
		System.out.println(mem1.toString());
		
		
		Member mem2 = new Member("id");
		
		System.out.println("************************");
		System.out.println(mem1.equals(mem2));
		
	}
	

}
