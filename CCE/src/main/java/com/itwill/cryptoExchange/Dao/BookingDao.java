package com.itwill.cryptoExchange.Dao;

import java.util.List;

import com.itwill.cryptoExchange.Dto.Booking;

public interface BookingDao {

	/*
	 * READ ALL
	 */
	List<Booking> selectAllByMemberNo(int memberNo) throws Exception;

	List<Booking> selectAllByProductNo(int productNo) throws Exception;
	/*
	 * CREATE
	 */
	boolean insertBooking(Booking booking) throws Exception;
	
	
	/*
	 * READ ONE
	 */
	AccountDao selectByMemberNo(int memberNo) throws Exception;

	/*
	 * DELETE
	 */
	boolean deleteBooking(int bookingNo) throws Exception;

	/*
	 * UPDATE
	 */
	boolean updateBooking(Booking booking) throws Exception;
}
