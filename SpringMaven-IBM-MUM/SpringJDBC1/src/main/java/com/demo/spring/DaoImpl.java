package com.demo.spring;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;

public class DaoImpl implements Dao {
	JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int insert(List<Emp> list) {
		int n = 0;
		int row = 0;
		for (final Emp e : list) {
			n = jdbcTemplate.update(new PreparedStatementCreator() {

				public PreparedStatement createPreparedStatement(Connection conn)
						throws SQLException {
					PreparedStatement pst = conn
							.prepareStatement("insert into emp values(?,?,?,?)");
					pst.setInt(1, e.getEmpId());
					pst.setString(2, e.getName());
					pst.setString(3, e.getAddress());
					pst.setDouble(4, e.getSalary());
					return pst;
				}
			});
			row = row + n;
		}
		return row;
	}
}
