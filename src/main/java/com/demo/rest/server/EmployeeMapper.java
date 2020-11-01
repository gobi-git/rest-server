package com.demo.rest.server;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

public class EmployeeMapper {

	public List<Employee> getAllEmployees() {
		
		MyBatisUtil myBatisUtil = new MyBatisUtil();
		SqlSession session = myBatisUtil.getSqlSessionFactory().openSession();
		@SuppressWarnings("unchecked")
		List<Employee> employeesList = session.selectList("getAllEmployees");
		session.commit();
		session.close();
		return employeesList;
	}

	public Employee findById(int employeeId) {
		MyBatisUtil myBatisUtil = new MyBatisUtil();
		SqlSession session = myBatisUtil.getSqlSessionFactory().openSession();
		Employee employee = (Employee) session.selectOne("findById", employeeId);
		session.commit();
		session.close();
		return employee;
	}

}
