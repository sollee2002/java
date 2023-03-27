package com.jungang;

import java.util.Scanner;

public class Person {
	Scanner sc = new Scanner(System.in);
	
	protected String name;
	private int age;
	private double height;
	private double weight;
	
	public Person() {
		
	}
	
	public Person(int age, double height, double weight) {
		this.age=age;
		this.height=height;
		this.weight=weight;		
	}
	
	public String information() {
		name=sc.next();
		age=sc.nextInt();
		height=sc.nextDouble();
		weight=sc.nextDouble();
//		System.out.println(name+" "+age+" "+height+" "+weight);
		return "";
	}

}
