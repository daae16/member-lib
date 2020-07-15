package com.member.lib.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Connection3 {
	private static final String URL = "jdbc:oracle:thin:localhost/xe";
	private static final String ID = "c##test";
	private static final String PWD = "test";
	private static final String DRIVER_NAME = "oracle.jdbc.driver.OracleDriver";
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(URL,ID,PWD);
		//Statement conn = 
		
		
	}
	
	

}
