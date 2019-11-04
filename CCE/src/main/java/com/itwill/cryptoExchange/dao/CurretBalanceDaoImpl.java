package com.itwill.cryptoExchange.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.itwill.cryptoExchange.dto.Booking;
import com.itwill.cryptoExchange.dto.CurrentBalance;

@Repository
public class CurretBalanceDaoImpl implements CurrentBalanceDao{

	@Override
	@Transactional
	public List<CurrentBalance> selectAllByAccountNo(int accountNo) throws Exception {
		Session session = HibernateUtil.getSession();
		 List<CurrentBalance> cbList;

		try {
			    session.beginTransaction();
			    cbList = session.createQuery("from booking where a_no="+accountNo).getResultList();
			   
		} finally {
			session.close();

		}

		return cbList;
	}

	@Override
	@Transactional
	public List<CurrentBalance> selectAllByProductNo(int productNo) throws Exception {
		Session session = HibernateUtil.getSession();
		 List<CurrentBalance> cbList;

		try {
			    session.beginTransaction();
			    cbList = session.createQuery("from booking where p_no="+productNo).getResultList();
			   
		} finally {
			session.close();

		}

		return cbList;
	}

	@Override
	public boolean insertCurrentBalance(CurrentBalance currentBalance) throws Exception {
		boolean issuccess = false;

		 Session session = HibernateUtil.getSession();
		try {
			    session.beginTransaction();
			    Integer i = (Integer) session.save(currentBalance);
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
	public CurrentBalance selectByAccountNo(int productNo, int AccountNo) throws Exception {

			Session session = HibernateUtil.getSession();
			CurrentBalance curbal;
			try {
				    session.beginTransaction();
				    curbal = (CurrentBalance) session.createQuery("select * from crypto_currency_exchange.cur_bal where p_no = "+productNo+"and a_no="+AccountNo);
				
			} finally {
				session.close();

			}

			return curbal;
		}

	@Override
	@Transactional
	public boolean deleteCurrentBalance(int productNo, int AccountNo) throws Exception {
		Session session = HibernateUtil.getSession();
		boolean issuccess = false;
		try {
			    session.beginTransaction();
			    session.createQuery("delete from crypto_currency_exchange.cur_bal where p_no = "+productNo+"and a_no="+AccountNo);
			    issuccess=true;
		} finally {
			session.close();

		}

		return issuccess;
	}

	@Override
	@Transactional
	public boolean updateCurrentBalance(CurrentBalance currentBalance) throws Exception {
		boolean issuccess = false;

		 Session session = HibernateUtil.getSession();

		try {
			    session.beginTransaction();
			    session.update(currentBalance);
			    session.getTransaction().commit();
			    issuccess=true;
		} finally {
			session.close();
		}
	
		return issuccess;
	}

}
