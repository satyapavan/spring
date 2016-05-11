package com.demo.spring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BatchInsertMain {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"context.xml");
		
		Dao dao = (Dao) ctx.getBean("dao");
		
		List<Emp> empList = new ArrayList<Emp>();
		
		empList.add(new Emp(100, "Amitabh", "Mumbai", 20000));
		empList.add(new Emp(101, "Shekhar", "Hyderabad", 30000));
		empList.add(new Emp(102, "Rekha", "Mumbai", 23000));
		empList.add(new Emp(103, "Kalluram", "Delhi", 60000));
		empList.add(new Emp(104, "Ajay", "Bangalore", 80000));
		
		int rows = dao.insert(empList);
		System.out.println("rows Inserted : " + rows);
	}

}
