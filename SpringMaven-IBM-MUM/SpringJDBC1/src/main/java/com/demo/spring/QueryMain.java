package com.demo.spring;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;

public class QueryMain {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"context.xml");
		JdbcTemplate jt = (JdbcTemplate) ctx.getBean("jdbcTemplate");
		List<Emp> empList = jt.query("select * from emp", new RowMapper<Emp>() {

			public Emp mapRow(ResultSet rs, int arg1) throws SQLException {
				Emp e = new Emp();
				e.setEmpId(rs.getInt("EMPNO"));
				e.setName(rs.getString("NAME"));
				e.setAddress(rs.getString("ADDRESS"));
				e.setSalary(rs.getDouble("SALARY"));
				return e;
			}

		});
		
		for(Emp e:empList){
			System.out.println(e);
		}

	}

}
