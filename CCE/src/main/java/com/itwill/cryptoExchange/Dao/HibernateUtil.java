package com.itwill.cryptoExchange.Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static final SessionFactory sessionFactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {
	try {
	    Configuration configuration = new Configuration();
	    configuration.configure();        

	    StandardServiceRegistry standardRegistry = new 
	    StandardServiceRegistryBuilder()
	            .configure("hibernate.cfg.xml")
	            .build();

	    return configuration.buildSessionFactory(standardRegistry);
	}
	catch(Exception e) {
	    throw new ExceptionInInitializerError(e);
	}
	}

	public static Session getSession()
	{
	return sessionFactory.openSession();
	}

	public static void close()
	{
	sessionFactory.close();
	}
	}

