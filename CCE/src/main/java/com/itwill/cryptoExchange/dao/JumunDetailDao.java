package com.itwill.cryptoExchange.dao;

import java.util.List;

import com.itwill.cryptoExchange.dto.JumunDetail;

public interface JumunDetailDao {
	/*
	 * READ ALL
	 */
	List<JumunDetail> selectAllByAccountNo(int accountNo) throws Exception;

	List<JumunDetail> selectAllByProductNo(int productNo) throws Exception;
	
	List<JumunDetail>selectAll(int accountNo,int productNo) throws Exception;
	
	/*
	 * CREATE
	 */
	boolean insertJumunDetail(JumunDetail jumunDetail) throws Exception;
	
	
	/*
	 * READ ONE
	 */
	JumunDetail selectJumunDetail(int jumunNo) throws Exception;

	/*
	 * DELETE
	 */
	boolean deleteJumunDetail(int jumunNo) throws Exception;

	/*
	 * UPDATE
	 */
	boolean updateJumunDetail(JumunDetail jumunDetail) throws Exception;
}
