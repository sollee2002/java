package com.ex2;

public class Cat extends Animal{

	private String location;
	private String color;
	
	public Cat() {
		
	}
	
	public Cat(String name, String kinds, String location, String color) {
		super(name,kinds);
		setLocation(location);
		setColor(color);
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void speak() {
		System.out.print(super.toString());
		System.out.println(getLocation()+"에 서식하며, 색상은 "+getColor()+"입니다");
		
	}
	
	
	
	
}
