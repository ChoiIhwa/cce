package com.itwill.cryptoExchange.dao;

import java.util.List;

import com.itwill.cryptoExchange.dto.Booking;

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
	Booking selectByMemberNo(int bookingNo) throws Exception;

	/*
	 * DELETE
	 */
	boolean deleteBooking(int bookingNo) throws Exception;

	/*
	 * UPDATE
	 */
	boolean updateBooking(Booking booking) throws Exception;
}
