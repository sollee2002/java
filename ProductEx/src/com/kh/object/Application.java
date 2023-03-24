package com.kh.object;

import com.kh.object.practice.Product;

public class Application {
	
	public static void main(String[] args) {
		Product ssg = new Product("ssgnote9","갤럭시노트9","경기도 수원",9600000,10);
		Product lg = new Product("lgxnote5","LG스마트폰5","경기도 평택",780000,0.7);
		Product kt = new Product("ktsnote3","KT스마트폰3","서울시 강남",250000,0.3);
		
		System.out.println(ssg.information());
		System.out.println(lg.information());
		System.out.println(kt.information());
		
		System.out.println("===========================================");
		ssg.setPrice(1200000);
		ssg.setTax(0.05);
		System.out.println(ssg.information());
		
		lg.setPrice(1200000);
		lg.setTax(0.05);
		System.out.println(lg.information());
		
		kt.setPrice(1200000);
		kt.setTax(0.05);
		System.out.println(kt.information());
		System.out.println("===========================================");
		
		ssg.calc();
		lg.calc();
		kt.calc();
		
		
		
		
		
		
		
	}
	

}
