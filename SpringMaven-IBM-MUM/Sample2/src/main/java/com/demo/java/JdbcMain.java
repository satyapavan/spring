package com.demo.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcMain {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/spring", "root", "root");
		Statement stmt = conn.createStatement();
		int rows = stmt
				.executeUpdate("insert into emp(empno,name,address,salary) values"
						+ "(123,'Shantanu','Hyderabad',32000)");
		System.out.println("Rows inserted : " + rows);
		conn.close();

	}

}
