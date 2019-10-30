package com.itwill.cryptoExchange.Dao;

import java.util.List;

import com.itwill.cryptoExchange.Dto.CurrentBalance;
import com.itwill.cryptoExchange.Dto.Members;

public interface MembersDao {

	/*
	 * READ ALL
	 */
	//List<Member> selectAllByAccountNo(int ) throws Exception;

	/*
	 * CREATE
	 */
	boolean insertMember(Members members) throws Exception;
	
	
	/*
	 * READ ONE
	 */
	AccountDao selectMember(int memberNo) throws Exception;

	/*
	 * DELETE
	 */
	boolean deleteMember(int memberNo) throws Exception;

	/*
	 * UPDATE
	 */
	boolean updateMember(Members members) throws Exception;
}