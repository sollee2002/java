package com.arrayListEx;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		//리스트에 저장
		//추가
		list.add("Java");
		list.add("JDBC");
		list.add("Servelet/JSP");
		list.add("myBATIS");
		list.add(2, "DataBase"); //2번인덱스에 값이 추가되고 인덱스가 1씩 밀림
		//삭제
		list.remove(1); //1번인덱스 값이 제거되고 인덱스가 1씩 당겨짐
		//변경
		list.set(2,"oracle");
		
		//리스트에 저장된 총 갯수
		int size = list.size();
		System.out.println("총 갯수: "+size);
		
		//리스트에 저장된 객체 얻기
		//인덱스 0부터 시작한다
		String str = list.get(2);
		System.out.println("2번: "+str);
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(i+" "+list.get(i));
		}
		
			int i=0;
		for(String l : list) {
			System.out.println(i+" "+l);
			i++;
		}
		
		
	}
	

}
