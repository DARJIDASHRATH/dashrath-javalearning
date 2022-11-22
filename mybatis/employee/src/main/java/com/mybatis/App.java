package com.mybatis;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.mybatis.model.Employee;

public class App {

	public static void main(String[] args) throws IOException {
		Reader reader = Resources.getResourceAsReader("SqlMybatisConfig.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		SqlSession session = sqlSessionFactory.openSession();

		Employee employee = new Employee("Dashrath", "Java", 25000, "9662305594", "dashrath@yahoo.com");
		session.insert("com.mybatis.model.Employee.insert", employee);
		System.out.println("record inserted successfully");

		Employee emp = new Employee("Das", "dotnet", 35000, "986965564", "xyz@hdf.dvswe");
		session.insert("com.mybatis.model.Employee.insert", emp);
		System.out.println("record inserted successfully");

		session.commit();
		session.close();
	}

}