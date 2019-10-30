package com.itwill.cryptoExchange.Dao;

import com.itwill.cryptoExchange.Dto.Members;

public class MemberService {

	public static void main(String[] args) throws Exception {
		
		MemberDaoImpl md = new MemberDaoImpl();

		Members members = new Members("hi1512", "qkqh", "ChoiIHwa", "hi1512@naver.com", "980223-2222222", "01091761598");
		
		md.insertMember(members);
		
		System.out.println("done!");
	
	}
	
	
	
}
