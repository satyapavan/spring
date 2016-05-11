package com.demo.spring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

public class BatchInsertMain2 {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"context.xml");
		
		final Dao dao = (Dao) ctx.getBean("dao");
		TransactionTemplate tt= (TransactionTemplate)ctx.getBean("transactionTemplate");
		
		final List<Emp> empList = new ArrayList<Emp>();
		
		empList.add(new Emp(105, "Amitabh", "Mumbai", 20000));
		empList.add(new Emp(106, "Shekhar", "Hyderabad", 30000));
		empList.add(new Emp(102, "Rekha", "Mumbai", 23000));
		empList.add(new Emp(108, "Kalluram", "Delhi", 60000));
		empList.add(new Emp(109, "Ajay", "Bangalore", 80000));
		
		String status=tt.execute(new TransactionCallback<String>() {
			public String doInTransaction(TransactionStatus arg0) {
				int rows = dao.insert(empList);
				return "success";
			}
		});
		
		System.out.println("rows Inserted : " + status);
	}

}
