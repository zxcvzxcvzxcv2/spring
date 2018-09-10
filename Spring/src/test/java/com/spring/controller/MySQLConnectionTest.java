package com.spring.controller;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class MySQLConnectionTest {
	
	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String URL    = "jdbc:mysql://localhost:3306/mysql";
	private static final String USER   = "root";
	private static final String PW     = "12345";
	
	@Test
	public void testConnection() throws Exception {
		
		Class.forName(DRIVER);
		
		try(Connection con = DriverManager.getConnection(URL, USER, PW)) {
			System.err.println(con);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
