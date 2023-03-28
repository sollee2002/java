package com.ex;

public class Cat extends Animal {

	private String location;
	private String color;
	
	public Cat() {
		
	}
	
	public Cat(String name, String kinds, String location, String color) {
		super(name,kinds);
		this.location=location;
		this.color=color;
	}

	@Override
	public void speak() {
		System.out.println(super.toString());
		System.out.println(location+"에 서식하며, 색상은 "+color+"입니다.");
	}
	
	
}
