package com.itwill.cryptoExchange.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.itwill.cryptoExchange.dto.Booking;

@Repository
public class BookingDaoImpl implements BookingDao{


	@Override
	@Transactional
	public List<Booking> selectAllByMemberNo(int memberNo) throws Exception {
		 Session session = HibernateUtil.getSession();
		 List<Booking> bookingList;

		try {
			    session.beginTransaction(); 
			    bookingList = session.createQuery("from booking where m_no="+memberNo).getResultList();
			   
		} finally {
			session.close();

		}

		return bookingList;
	}
	

	@Override
	@Transactional
	public List<Booking> selectAllByProductNo(int productNo) throws Exception {
		 Session session = HibernateUtil.getSession();
		 List<Booking> bookingList;

		try {
			    session.beginTransaction();
			    bookingList = session.createQuery("from booking where p_no="+productNo).getResultList();
			   
		} finally {
			session.close();

		}

		return bookingList;
	}

	@Override
	@Transactional
	public boolean insertBooking(Booking booking) throws Exception {
		boolean issuccess = false;

		 Session session = HibernateUtil.getSession();
		try {
			    session.beginTransaction();
			    Integer i = (Integer) session.save(booking);
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
	public Booking selectByMemberNo(int bookingNo) throws Exception {
		Session session = HibernateUtil.getSession();
		Booking booking;
		try {
			    session.beginTransaction();
			    booking = session.get(Booking.class, bookingNo);
			
		} finally {
			session.close();

		}

		return booking;
	}
		

	@Override
	@Transactional
	public boolean deleteBooking(int bookingNo) throws Exception {
		boolean issuccess = false;

		 Session session = HibernateUtil.getSession();

		try {
			    session.beginTransaction();
			    Booking booking = session.get(Booking.class, bookingNo);
			    session.delete(booking);
			    session.getTransaction().commit();
			    issuccess=true;
		} finally {
			session.close();

		}
		
		
		return issuccess;
	}

	@Override
	@Transactional
	public boolean updateBooking(Booking booking) throws Exception {
		boolean issuccess = false;

		 Session session = HibernateUtil.getSession();

		try {
			    session.beginTransaction();
			    session.update(booking);
			    session.getTransaction().commit();
			    issuccess=true;
		} finally {
			session.close();
		}
	
		return issuccess;
	}

}
