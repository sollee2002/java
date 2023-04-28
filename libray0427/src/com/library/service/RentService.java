package com.library.service;

import com.library.dao.RentDao;

public class RentService {
	
	RentDao dao = new RentDao();
	
	public String getRentYN(int no) {
		String rentYN = dao.getRentYN(no);
		return rentYN;
	}

	public void rentBook(int no, String id) {
		//대여가능여부 체크
		String yn = dao.getRentYN(no);
		if("Y".equals(yn)) {
			System.out.println("이미 대여 중인 도서입니다");
			return;
		}
		
		int res = dao.insert(id, no);
		System.out.println(res+"건 대여되었습니다");
	}
	
	public void returnBook(int no) {
		//반납가능여부 체크
		String yn = dao.getRentYN(no);
		if("N".equals(yn)) {
			System.out.println("반납 가능한 도서가 아닙니다");
			return;
		}
		
		int res = dao.update(no);
		System.out.println(res+"건 반납되었습니다");
	}
}
