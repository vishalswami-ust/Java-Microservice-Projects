package com.iiht.jdbcannotconfig;

import java.sql.SQLException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAppJDBC {

	public static void main(String[] args) throws SQLException, ClassNotFoundException{
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AutoConfig.class);
		JDBCService service = (JDBCService) context.getBean("service");
		service.getData();
	}

}
