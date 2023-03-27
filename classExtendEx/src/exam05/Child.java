package exam05;

public class Child extends Parent {
	private String name;
	
	public Child() {
		this("홍길동");
		System.out.println("Chile() Call");
	}

	public Child(String name) {
		this.name=name;
		System.out.println("Chile(String name) Call");
	}

}
