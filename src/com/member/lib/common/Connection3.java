package com.member.lib.common;

import java.sql.*;


public class Connection3 {
	
	public static void main(String[] args) {
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe","c##test","test");
			String sql = "select * from user_info";
			stmt=con.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				System.out.println("[회원번호 =" + rs.getInt("num")+" "+"회원이름="+rs.getString("name")+" "+"회원특징="+rs.getString("etc")+"]");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null) {
					rs.close();
				}
				if(stmt!=null) {
					stmt.close();
				}
				if(con!=null) {
					con.close();
				}
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
