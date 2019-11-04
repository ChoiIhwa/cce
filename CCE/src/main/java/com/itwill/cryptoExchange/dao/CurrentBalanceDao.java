package com.itwill.cryptoExchange.dao;

import java.util.List;

import com.itwill.cryptoExchange.dto.CurrentBalance;


public interface CurrentBalanceDao {

	/*
	 * READ ALL
	 */
	List<CurrentBalance> selectAllByAccountNo(int accountNo) throws Exception;

	List<CurrentBalance> selectAllByProductNo(int productNo) throws Exception;
	/*
	 * CREATE
	 */
	boolean insertCurrentBalance(CurrentBalance currentBalance) throws Exception;
	
	
	/*
	 * READ ONE
	 */
	CurrentBalance selectByAccountNo(int productoNo, int AccountNo) throws Exception;

	/*
	 * DELETE
	 */
	boolean deleteCurrentBalance(int productoNo, int AccountNo) throws Exception;

	/*
	 * UPDATE
	 */
	boolean updateCurrentBalance(CurrentBalance currentBalance) throws Exception;
}
