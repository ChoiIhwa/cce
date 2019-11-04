package com.itwill.cryptoExchange.dao;

import com.itwill.cryptoExchange.dto.Members;

public interface testDao {

	boolean insertMember(Members members) throws Exception;

	AccountDao selectMember(int memberNo) throws Exception;

	boolean deleteMember(int memberNo) throws Exception;

	boolean updateMember(Members members) throws Exception;

}