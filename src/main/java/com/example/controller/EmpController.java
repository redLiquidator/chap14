package com.example.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.dao.EmpDao;
import com.example.domain.Emp;

@Controller
public class EmpController {
	static Log log=LogFactory.getLog(EmpController.class);
	@Autowired
	EmpDao dao;
	
	@RequestMapping("/emp/listall")
	public String listAll(HttpServletRequest request){
		log.info("############");
		log.info("#listAll()##");
		log.info("############");
		List<Emp> list=dao.getAllEmps();
		
		request.setAttribute("emps",list);
		
		return "listall";
	}
}
