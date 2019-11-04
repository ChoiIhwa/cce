package com.itwill.cryptoExchange.dao;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.itwill.cryptoExchange.dto.Account;

@Repository
public class AccountDaoImpl implements AccountDao{

	@Override
	@Transactional
	public boolean insertAccount(AccountDao account) throws Exception {
		boolean issuccess = false;

		 Session session = HibernateUtil.getSession();


		try {
			    session.beginTransaction();
			    Integer i = (Integer) session.save(account);
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
	public Account selectByMemberNo(int no) throws Exception {
		Session issession = HibernateUtil.getSession();
		Account account;
		try {
			    issession.beginTransaction();
			    account = issession.get(Account.class, no);
			
		} finally {
			issession.close();

		}

		return account;
	}
		

	@Override
	@Transactional
	public boolean deleteAccountByMemberNo(int memberNo) throws Exception {
		boolean issuccess = false;

		 Session session = HibernateUtil.getSession();

		try {
			    session.beginTransaction();
			    Account account = session.get(Account.class, memberNo);
			    session.delete(account);
			    session.getTransaction().commit();
			    issuccess=true;
		} finally {
			session.close();

		}
		
		
		return issuccess;
	}

	@Override
	@Transactional
	public boolean updateAccountBalance(int memberNo,int balance) throws Exception {
		boolean issuccess = false;

		 Session session = HibernateUtil.getSession();

		try {
			    session.beginTransaction();
			    Account account = session.get(Account.class, memberNo);
			    account.setA_bal(balance);
			    session.update(account);
			    session.getTransaction().commit();
			    issuccess=true;
		} finally {
			session.close();

		}
		
		return issuccess;
	}

}
