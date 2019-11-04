package com.itwill.cryptoExchange.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.itwill.cryptoExchange.dto.Product;

@Repository
public class ProductDaoImpl implements ProductDao{

	@Override
	@Transactional
	public List<Product> selectAll() throws Exception {
		
		 Session session = HibernateUtil.getSession();
		 List<Product> productList;

		try {
			    session.beginTransaction();
			    productList = session.createQuery("from product").getResultList();
			   
		} finally {
			session.close();

		}

		return productList;
	}

	@Override
	@Transactional
	public boolean insertProduct(Product product) throws Exception {
		boolean issuccess = false;

		 Session session = HibernateUtil.getSession();


		try {
			    session.beginTransaction();
			    Integer i = (Integer) session.save(product);
			    session.getTransaction().commit();
			    
			    if(i==1) {
			    	issuccess=true;
			    }
			    
		} finally {
			session.close();

		}

		return issuccess;
	}

	@Override
	@Transactional
	public Product selectByProductNo(int proNo) throws Exception {
		Session issession = HibernateUtil.getSession();
		Product product;
		try {
			    issession.beginTransaction();
			    product = issession.get(Product.class, proNo);
			
		} finally {
			issession.close();

		}

		return product;
	}
	

	@Override
	public boolean deleteProduct(int productNo) throws Exception {
		boolean issuccess = false;

		 Session session = HibernateUtil.getSession();

		try {
			    session.beginTransaction();
			    Product product = session.get(Product.class, productNo);
			    session.delete(product);
			    session.getTransaction().commit();
			    issuccess=true;
		} finally {
			session.close();

		}
		
		
		return issuccess;
	}

	@Override
	@Transactional
	public boolean updateProduct(Product product) throws Exception {
		boolean issuccess = false;

		 Session session = HibernateUtil.getSession();

		try {
			    session.beginTransaction();
			    session.update(product);
			    session.getTransaction().commit();
			    issuccess=true;
		} finally {
			session.close();

		}
		
		
		return issuccess;
	}
	
}
