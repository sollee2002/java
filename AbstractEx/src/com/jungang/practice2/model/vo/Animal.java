package com.jungang.practice2.model.vo;

public abstract class Animal {
	private String name;
	private String kinds;
	
	protected void Animal() {
		
	}
	
	protected void Animal(String name, String kinds) {
		this.name=name;
		this.kinds=kinds;
	}
	
	public String toString() {
		System.out.println("==================================");
		return "저의 이름은 "+getName()+"이고, 종류는 "+getKinds()+"입니다";
	}
	
	public abstract void speak();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getKinds() {
		return kinds;
	}

	public void setKinds(String kinds) {
		this.kinds = kinds;
	}

}
