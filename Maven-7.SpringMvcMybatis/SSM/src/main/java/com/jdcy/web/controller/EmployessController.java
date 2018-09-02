package com.jdcy.web.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jdcy.model.entity.Employess;
import com.jdcy.model.service.EmployessService;

@Controller
@RequestMapping(value = "emp")
public class EmployessController {

	@Autowired
	private EmployessService employessService;

	@RequestMapping(value = "query", method = RequestMethod.GET)
	public String query(HttpServletRequest request) {
		List<Employess> elist = employessService.query();
		request.setAttribute("elist", elist);
		return "query";
	}
}
