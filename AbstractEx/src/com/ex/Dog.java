package com.ex;

public class Dog extends Animal {
	//필드 대문자 - 상수 static final로 선언 
	public static final  String PLACE ="애견카페";
	private int weight;
	
	public Dog() {
		
	}
	
	public Dog(String name, String kinds, int weight) {
		super(name,kinds);
		setWeight(weight);;
	}

	@Override
	public void speak() {
		//부모의 메서드 호출
		System.out.println(super.toString()+"몸무게는 "+getWeight()+"kg 입니다.");
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	

}
