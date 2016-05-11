package com.demo.spring;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;

public class QueryMain2 {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"context.xml");
		JdbcTemplate jt = (JdbcTemplate) ctx.getBean("jdbcTemplate");
		jt.query("select * from emp", new RowCallbackHandler() {

			public void processRow(ResultSet rs) throws SQLException {

				System.out.println(rs.getInt(1) + " " + rs.getString(1) + " "
						+ rs.getString(3) + " " + rs.getDouble(4));
			}
		});

	}

}
