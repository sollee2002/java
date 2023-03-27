package sec01.exam05;

class A {}

class B extends A {}
class C extends A {}

class D extends B {}
class E extends C {}

public class PromotionEx {
	public static void main(String[] args) {
		
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a1 = b; //부모타입으로 자동형변환
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		B b1 = d;
		C c1 = e;
		
//		B b2 = e;
//		C c2 = d; 상속관계에 있지 않기 때문에 컴파일 에러 발생
		

	}

}
