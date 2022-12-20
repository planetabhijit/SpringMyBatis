package com.abhijit.myspringbatis.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.abhijit.myspringbatis.entity.Employee;
import com.abhijit.myspringbatis.util.MyBatisUtil;

@Repository
public class EmployeeMapper {

	public List<Employee> getAllEmployee() {

		SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
		List<Employee> employeeList = sqlSession.selectList("getAllEmployees");
		sqlSession.commit();
		sqlSession.close();

		return employeeList;
	}

	public void saveEmployee(Employee employee) {

		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		session.insert("insertEmployee", employee);
		session.commit();
		session.close();

	}

}
