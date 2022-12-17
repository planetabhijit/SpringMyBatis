package com.abhijit.myspringbatis;

import javax.xml.ws.RequestWrapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.abhijit.myspringbatis.dao.EmployeeMapper;

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
	
}
