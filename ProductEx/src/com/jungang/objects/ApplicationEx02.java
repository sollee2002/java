package com.jungang.objects;

public class ApplicationEx02 {
	
	public static void main(String[] args) {
		ProductEx02 ssg = new ProductEx02();
		ProductEx02 lg = new ProductEx02("lgsnote5","LG스마트폰5","경기도 평택",780000,0.7);
		ProductEx02 kt = new ProductEx02("ktsnote3","KT스마트폰3","서울시 강남",250000,0.3);

		
		System.out.println(ssg.infotmation());
		System.out.println(lg.infotmation());
		System.out.println(kt.infotmation());
		System.out.println("=======================================");
		
		ssg.setPrice(1200000);
		lg.setPrice(1200000);
		kt.setPrice(1200000);
		
		ssg.setTax(0.05);
		lg.setTax(0.05);
		kt.setTax(0.05);
		
		System.out.println(ssg.infotmation());
		System.out.println(lg.infotmation());
		System.out.println(kt.infotmation());
		System.out.println("=======================================");
		
		ssg.calc();
		lg.calc();
		kt.calc();
		
		
		
	}
	
	
	
	

}
