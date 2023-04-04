package com.library;

public class Appliation {
	
	public static void main(String[] args) {
		
		Library lib = new Library();

		
		System.out.println(lib.toString());
		lib.insert(4, "책1", "작가1", false);
		System.out.println(lib.toString());

		//getlist에서 기존값만 가져오고 신규값을 가져오지 않음
		//fileSave가 정상적으로 작동하지 않아 booklist.txt에 신규값 저장되지 않음
		
		
	}

}
