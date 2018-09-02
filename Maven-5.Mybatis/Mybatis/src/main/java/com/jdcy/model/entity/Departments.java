package com.jdcy.model.entity;

import java.util.ArrayList;
import java.util.List;

public class Departments {
	private Integer did;

	private String dname;

	private List<Employess> employesses = new ArrayList<Employess>();

	public List<Employess> getEmployesses() {
		return employesses;
	}

	public void setEmployesses(List<Employess> employesses) {
		this.employesses = employesses;
	}

	public Integer getDid() {
		return did;
	}

	public void setDid(Integer did) {
		this.did = did;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname == null ? null : dname.trim();
	}
}