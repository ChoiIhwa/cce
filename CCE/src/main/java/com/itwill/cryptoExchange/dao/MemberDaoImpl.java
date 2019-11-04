package com.itwill.cryptoExchange.dao;


import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.itwill.cryptoExchange.dto.Members;

@Repository("membersDao")
public class MemberDaoImpl implements MembersDao{
	
	@Override
	@Transactional
	public boolean insertMember(Members members) throws Exception {
		boolean issuccess = false;

		 Session session = HibernateUtil.getSession();


		try {
			    session.beginTransaction();
			    Integer i = (Integer) session.save(members);
			    session.getTransaction().commit();
			    
			    if(i==1) {
			    	issuccess=true;
			    }
			    
		} finally {
			session.close();

		}

		return issuccess;
	}

	@Override
	@Transactional
	public Members selectMember(int memberNo) throws Exception {
		Session session = HibernateUtil.getSession();
		Members member;
		try {
			    session.beginTransaction();
			    member = session.get(Members.class, memberNo);
			  
		} finally {
			session.close();

		}

		return member;
	}

	@Override
	@Transactional
	public boolean deleteMember(int memberNo) throws Exception {
		boolean issuccess = false;

		 Session session = HibernateUtil.getSession();

		try {
			    session.beginTransaction();
			    Members member = session.get(Members.class, memberNo);
			    session.delete(member);
			    session.getTransaction().commit();
			    issuccess=true;
		} finally {
			session.close();

		}
		
		
		return issuccess;
	}

	@Override
	@Transactional
	public boolean updateMember(Members members) throws Exception {
		boolean issuccess = false;

		 Session session = HibernateUtil.getSession();

		try {
			    session.beginTransaction();
			    session.update(members);
			    session.getTransaction().commit();
			    issuccess=true;
		} finally {
			session.close();

		}
		
		
		return issuccess;
	}

}