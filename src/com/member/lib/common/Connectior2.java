package com.member.lib.common;

import java.sql.*;

public class Connectior2 {

	public static void main(String[] args) {

		Connection con = null;
		PreparedStatement pr = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "c##test", "test");
			String sql = "insert into user_info (num,name,etc) value (?,?,?)";
			pr = con.prepareStatement(sql);
			pr.setInt(1, 1);
			pr.setString(2, "이름");
			pr.setString(3, "기타특징");
			pr.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pr != null) {
					pr.close();

				}
				if (con != null) {
					con.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
