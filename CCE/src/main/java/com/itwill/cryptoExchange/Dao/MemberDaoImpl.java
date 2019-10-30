package com.itwill.cryptoExchange.Dao;

import java.lang.reflect.Member;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.itwill.cryptoExchange.Dto.Members;

public class MemberDaoImpl implements MembersDao, testDao{

	public boolean insertMember(Members members) throws Exception {
		boolean success=false;
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").
									addAnnotatedClass(Member.class).buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			session.beginTransaction();
			
			session.save(members);
			
			session.getTransaction().commit();
			
			success=true;
		
		}finally{
			factory.close();
			
		}
		
		return success;
	}

	public AccountDao selectMember(int memberNo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean deleteMember(int memberNo) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean updateMember(Members members) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

}