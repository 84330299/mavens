package com.jdcy.model.entity;

import java.util.Date;

public class Employess {
	private Integer eid;

	private String ename;

	private String esex;

	private Date ebirthday;

	private Integer did;

	private Departments departments;

	public Departments getDepartments() {
		return departments;
	}

	public void setDepartments(Departments departments) {
		this.departments = departments;
	}

	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename == null ? null : ename.trim();
	}

	public String getEsex() {
		return esex;
	}

	public void setEsex(String esex) {
		this.esex = esex == null ? null : esex.trim();
	}

	public Date getEbirthday() {
		return ebirthday;
	}

	public void setEbirthday(Date ebirthday) {
		this.ebirthday = ebirthday;
	}

	public Integer getDid() {
		return did;
	}

	public void setDid(Integer did) {
		this.did = did;
	}
}