package com.demo.spring;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;

public class App {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"context.xml");
		JdbcTemplate jt = (JdbcTemplate) ctx.getBean("jdbcTemplate");
		/*
		 * int row = jt
		 * .update("insert into emp values(111,'Amit','Mumbai',50000)");
		 */
		int row=jt.update(new PreparedStatementCreator() {
			
			public PreparedStatement createPreparedStatement(Connection conn)
					throws SQLException {
				PreparedStatement pst = conn
						.prepareStatement("insert into emp values(?,?,?,?)");
				pst.setInt(1, 221);
				pst.setString(2, "Mallika");
				pst.setString(3, "Mumbai");
				pst.setDouble(4, 60000);
				return pst;
			}
		});
		System.out.println(row);

	}

}

class MyPSC implements PreparedStatementCreator {

	public PreparedStatement createPreparedStatement(Connection conn)
			throws SQLException {
		PreparedStatement pst = conn
				.prepareStatement("insert into emp values(?,?,?,?)");
		pst.setInt(1, 222);
		pst.setString(2, "Aditi");
		pst.setString(3, "Kerala");
		pst.setDouble(4, 60000);
		return pst;
	}

}
