package com.itwill.cryptoExchange.dao;


import com.itwill.cryptoExchange.dto.Account;


public interface AccountDao {

	

	/*
	 * CREATE
	 */
	boolean insertAccount(AccountDao account) throws Exception;

	/*
	 * READ ONE
	 */
	Account selectByMemberNo(int no) throws Exception;

	/*
	 * DELETE
	 */
	boolean deleteAccountByMemberNo(int no) throws Exception;

	/*
	 * UPDATE
	 */
	boolean updateAccountBalance(int memberNo,int balance) throws Exception;
}
