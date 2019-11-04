package com.itwill.cryptoExchange.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itwill.cryptoExchange.dto.Members;

@Service
public class MemberService {
	
	@Autowired
	private MemberDaoImpl md;
	
	public void setMd(MemberDaoImpl md) {
		this.md = md;
	}
	
	public boolean insertmembers(Members members) throws Exception {
		Boolean issuccess = md.insertMember(members);
		return issuccess;
		
	}



	
	
	

	
	
	
}
