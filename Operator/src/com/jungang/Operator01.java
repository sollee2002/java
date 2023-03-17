package com.jungang;

public class Operator01 {

	public static void main(String[] args) {
		int v2=1;//=>1.0
		double v3=1.0;
		System.out.println(v2==v3);//true
		
		
		//float가 double로 변환될때 값에 미세한 차이가 나기 때문에 비교했을때 false가 반환된다
		
		double v5 = 0.1;
		float v4 = 0.1f;
		System.out.println(v5==v4);
		
		
		
		
	}

}
