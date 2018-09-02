package com.jdcy.web.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "home")
public class HomeController {

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(HttpServletRequest request) {
		List<String> aa = new ArrayList<String>();
		aa.add("aaaa");
		aa.add("bbb");
		aa.add("ccc");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String time = sdf.format(new Date());
		request.setAttribute("time", time);
		request.setAttribute("aa", aa);
		System.out.println();
		return "index";
	}

}
