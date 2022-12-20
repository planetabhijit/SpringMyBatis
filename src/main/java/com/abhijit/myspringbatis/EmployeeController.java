package com.abhijit.myspringbatis;

import javax.xml.ws.RequestWrapper;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.abhijit.myspringbatis.dao.EmployeeMapper;
import com.abhijit.myspringbatis.entity.Employee;
import com.abhijit.myspringbatis.util.MyBatisUtil;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeMapper mapper;
	
	@RequestMapping("/")
	public ModelAndView index() {
		
	System.out.println(mapper.getAllEmployee());
	ModelAndView mav = new ModelAndView("list-employees");
	mav.addObject("listemployees", mapper.getAllEmployee());
		return mav;
	}

	@RequestMapping("/showFormForAddEmployee")
	public ModelAndView showForm() {
		ModelAndView mav = new ModelAndView("add-employee");
		mav.addObject("employee", new Employee());
		
		return mav;
	}
	
}
