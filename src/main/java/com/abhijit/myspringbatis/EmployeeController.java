package com.abhijit.myspringbatis;

import javax.xml.ws.RequestWrapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.abhijit.myspringbatis.dao.EmployeeMapper;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeMapper mapper;
	
	@RequestMapping("/")
	public String index() {
		
		System.out.println(mapper.getAllEmployee());
		return "list-employees";
	}
	
	
	
}
