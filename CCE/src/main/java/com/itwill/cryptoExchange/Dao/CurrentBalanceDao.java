package com.itwill.cryptoExchange.Dao;

import java.util.List;

import com.itwill.cryptoExchange.Dto.CurrentBalance;


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
	AccountDao selectByAccountNo(int accountNo) throws Exception;

	/*
	 * DELETE
	 */
	boolean deleteCurrentBalance(int productoNo, int AccountNo) throws Exception;

	/*
	 * UPDATE
	 */
	boolean updateCurrentBalance(CurrentBalance currentBalance) throws Exception;
}
