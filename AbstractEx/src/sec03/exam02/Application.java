package sec03.exam02;

public class Application {
	
	public static void main(String[] args) {
		
		Animal dog = new Dog();
		Animal cat = new Cat();
		//부모타입으로 형변환이 가능하다
		//생성은 할 수 없으나 변수의 타입으로 사용할 수 있다
		
		dog.sound();
		cat.sound();
		
		dog.print(dog);
		cat.print(cat);
		
		
	}
	

}
