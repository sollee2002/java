package com.ex;

public class Application {
	
	public static void main(String[] args) {
		//객체를 생성해서 사용하겠다(의존관계) - 점선
		//클래스를 상속받겠다 - 실선
		
		Animal[] animal = new Animal[5];
				
		for(int i=0; i<animal.length; i++) {
			int num=(int)((Math.random()*2)+1);
			
			if(num==1) {
				//배열이름[인덱스]=저장할 값;
				animal[i]=new Dog("멍멍이","강아지",7);
			} else if(num==2) {
				animal[i]=new Cat("나옹이","고양이","한국","고등어");
			}
		}
		
		for(Animal a : animal) {
			//자식 객체에서 재정의(오버라이딩)되어진 메서드가 호출
			a.speak();
		}
		
		
	}
	

}
