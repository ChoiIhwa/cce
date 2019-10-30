package com.itwill.cryptoExchange.Dao;

import java.lang.reflect.Member;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.itwill.cryptoExchange.Dto.Members;
import com.mysql.cj.Query;

public class MemberDaoImpl implements MembersDao, testDao {

	public boolean insertMember(Members members) throws Exception {
		boolean success = false;

		 Session session = HibernateUtil.getSession();


		try {
			/*
			 * Transaction transaction = session.beginTransaction();
			 * 
			 * 
			 * String sql ="INSERT INTO MEMBERS values (0,'"+
			 * members.getM_id()+"','"+members.getM_name()+"','"+members.getM_password()+
			 * "','"+members.getM_email()+"','"+
			 * members.getM_ssn()+"','"+members.getM_phone()+"')";
			 * 
			 * 
			 * session.createQuery(sql);
			 * 
			 * session.save(members);
			 * 
			 * 
			 * transaction.commit();
			 * 
			 * success=true;
			 */
			
			   

			    session.beginTransaction();
			    session.save(members);
			    session.getTransaction().commit();
			
		} finally {
			session.close();

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