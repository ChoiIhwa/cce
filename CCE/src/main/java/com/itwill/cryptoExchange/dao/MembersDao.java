package com.itwill.cryptoExchange.dao;


import com.itwill.cryptoExchange.dto.Members;

public interface MembersDao {

	/*
	 * READ ALL
	 */
	//List<Members> selectAllByAccountNo(int members) throws Exception;

	/*
	 * CREATE
	 */
	boolean insertMember(Members members) throws Exception;
	
	
	/*
	 * READ ONE
	 */
	Members selectMember(int memberNo) throws Exception;

	/*
	 * DELETE
	 */
	boolean deleteMember(int memberNo) throws Exception;

	/*
	 * UPDATE
	 */
	boolean updateMember(Members members) throws Exception;
}