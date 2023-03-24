package package02;

public class C {
	
//B b = new B(); B의 접근제한자가 default로 설정되어서 다른 패키지에선 불러올 수 없다
	
	//외부에서 생성자 접근 제한
	private C() {

	}
	
	public C(int i) {
		this();
	}
	
	
	public void method1() {
		System.out.println("test");
	}
	private void method2() {
		System.out.println("test");
	}
	
}
