package com.jungang;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		Student stu = new Student();
//		Person p = new Person();
		
		Student[] student = new Student[3];
		String[] Employee = new String[10];
		
		student[0]= new Student("홍길동",20,178.2,70.0, 1, "정보시스템공학과");
		student[1]= new Student("김말똥",21,187.3,80.0, 2, "경영학과");
		student[2]= new Student("강개순",23,167.0,45.0, 4, "정보통신공학과");
		
//		for(int i=0; i<Student.length; i++) {
//			Student[i]=p.information();
//		}
		
		for(int i=0; i<student.length; i++) {
			System.out.println(student[i]);
		}
		
		
	}

}
