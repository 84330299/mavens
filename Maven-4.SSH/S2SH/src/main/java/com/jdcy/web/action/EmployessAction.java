package com.jdcy.web.action;

import java.util.List;

import com.jdcy.model.entity.persist.Employess;
import com.jdcy.model.service.EmployessService;

public class EmployessAction {

	private EmployessService employessService;
	private List<Employess> elist;

	public List<Employess> getElist() {
		return elist;
	}

	public void setElist(List<Employess> elist) {
		this.elist = elist;
	}

	public void setEmployessService(EmployessService employessService) {
		this.employessService = employessService;
	}

	public String query() {
		elist = employessService.query();
		return "success";
	}

}
