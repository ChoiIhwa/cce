package com.itwill.cryptoExchange;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {

   public static void main(String[] args) {
      
      String jdbcUrl="jdbc:mysql://127.0.0.1:3306/crypto_currency_exchange?serverTimezone=UTC";
      String user = "root";
      String pass = "root";
      
      try {
    	  
         System.out.println("Connecting to database: " + jdbcUrl);
         
         Connection myConn = DriverManager.getConnection(jdbcUrl,user,pass);
         
         
         System.out.println("Connection successful!!!!");
         
         myConn.close();
         
      }catch(Exception exc){
         exc.printStackTrace();
         
      }

   }

}