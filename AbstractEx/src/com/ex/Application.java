package com.ex;

public class Application {
	
	public static void main(String[] args) {
		
		Animal[] animal = new Animal[5];
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		for(int i=0; i<animal.length; i++) {
			int num=(int)((Math.random()*2)+1);
			
			if(num==1) {
				animal[i]=new Dog("멍멍이","강아지",7);
			} else if(num==2) {
				animal[i]=new Cat("나옹이","고양이","한국","고등어");
			}
		}
		
		for(Animal a : animal) {
			a.speak();
		}
		
		
	}
	

}
