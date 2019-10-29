package com.itwill.cryptoExchange.Dao;

import java.util.List;


public interface AccountDao {

	

	/*
	 * CREATE
	 */
	boolean insertAccount(AccountDao account) throws Exception;

	/*
	 * READ ONE
	 */
	AccountDao selectByMemberNo(int no) throws Exception;

	/*
	 * DELETE
	 */
	boolean deleteAccountByMemberNo(int no) throws Exception;

	/*
	 * UPDATE
	 */
	boolean updateAccountBalance(int balance) throws Exception;
}
