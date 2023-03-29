package com.ex2;

public class Dog extends Animal {
	
	public static final String PLACE ="애견카페";
	private int weight;
	
	public Dog() {
		
	}
	
	public Dog(String name, String kinds, int weight) {
		super(name,kinds);
		setWeight(weight);
	}

	@Override
	public void speak() {
		System.out.print(super.toString());
		System.out.println("몸무게는 "+getWeight()+"kg 입니다");
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	
	
	
}
