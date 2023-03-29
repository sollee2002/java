package com.ex;

public abstract class Animal {
	//추상메소드 - 기울임꼴
	
	private String name;
	private String kinds;
	
	protected Animal() {
		
	}
	
	protected Animal(String name, String kinds) {
		this.name=name;
		this.kinds=kinds;
	}
	
	//문자열을 반환합니다
	public String toString() {
		System.out.println("================================================================");
		return "저의 이름은 "+name+"이고, 종류는 "+kinds+"입니다. ";
	}
	
	public abstract void speak();
	

}
