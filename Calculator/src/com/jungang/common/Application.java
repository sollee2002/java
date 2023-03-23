package com.jungang.common;

public class Application {

	public static void main(String[] args) {
		
		Person p = new Person();
		Person p2 = new Person("홍길동",20,175.5,70.7);
		
		System.out.println(p.inpormation());
		System.out.println(p2.inpormation());
		
		Person[] personArr = new Person[5];
		personArr[0]=new Person("김지민",20,0,0);
		personArr[1]=new Person("이지민",21,0,0);
		personArr[2]=new Person("박지민",22,0,0);
		personArr[3]=new Person("임지민",23,0,0);
		personArr[4]=new Person("한지민",24,0,0);
		
		//타입 변수명 : 배열
		System.out.println("==========================");
		for(Person person : personArr) {
			System.out.println(person.inpormation());
		}
		

	}

}
