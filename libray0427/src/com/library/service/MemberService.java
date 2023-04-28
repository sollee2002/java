package com.library.service;

import java.util.List;

import com.library.dao.MemberDao;
import com.library.vo.Book;
import com.library.vo.Member;


public class MemberService {

	MemberDao dao = new MemberDao();
	
	public Member login(String id, String pw) {
		
		Member member = null;
		
		member = dao.login(id, pw);
		
		return member;

	}

	public List<Member> getlist() {
		
		List<Member> list =  dao.getList();
		
		System.out.println("=============회원목록=============");
		for(Member member : list) {
			System.out.println(member);
		}
		System.out.println("================================");
		return list;
	}
	
	public void addMember(String id, String pw, String name, String adminyn) {
		
		boolean idCheck = dao.idCheck(id);
		if(idCheck) {
			
			Member member = new Member(id,pw,name,adminyn);
			int res = dao.insert(member);
			
			if(res>0) {
				System.out.println("입력되었습니다");
				
			}else {
				System.out.println("오류가 발생했습니다");
			}
			
		} else {
			System.out.println("중복되는 아이디입니다");
			System.out.println("등록할 수 없습니다");
		}
		
	}

	public void deleteMember(String id) {
		
		int res = dao.delete(id);
		
		if(res>0) {
			System.out.println(res+"건 삭제되었습니다");

		} else {
			System.out.println("삭제 중 오류가 발생했습니다");
		}
	}
	
	
}
