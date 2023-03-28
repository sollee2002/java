package com.jungang.practice2.model.vo;

public class Dog extends Animal{

	public String PLACE = "애견카페";
	private int weight;

	public Dog() {
		
	}
	
	public Dog(String name, String kinds, int weight) {
		super.Animal();
		super.setName(name);
		super.setKinds(kinds);
		this.weight=weight;
	}
	
	@Override
	public void speak() {
		System.out.println(super.toString());
		System.out.println("몸무게는 "+getWeight()+"kg입니다");
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	
	
}
