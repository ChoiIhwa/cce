package com.itwill.cryptoExchange.dao;

import java.util.List;

import com.itwill.cryptoExchange.dto.Product;

public interface ProductDao {

	/*
	 * READ ALL
	 */
	List<Product> selectAll() throws Exception;

	/*
	 * CREATE
	 */
	boolean insertProduct(Product productoNo) throws Exception;
	
	
	/*
	 * READ ONE
	 */
	Product selectByProductNo(int proNo) throws Exception;

	/*
	 * DELETE
	 */
	boolean deleteProduct(int productoNo) throws Exception;

	/*
	 * UPDATE
	 */
	boolean updateProduct(Product product) throws Exception;
}
