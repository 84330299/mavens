package com.jdcy.model.entity.persist;
// Generated 2017-7-15 11:33:34 by Hibernate Tools 4.3.1.Final

/**
 * Accounts generated by hbm2java
 */
public class Accounts implements java.io.Serializable {

	private Integer aid;
	private String aname;
	private String apwd;

	public Accounts() {
	}

	public Accounts(String aname, String apwd) {
		this.aname = aname;
		this.apwd = apwd;
	}

	public Integer getAid() {
		return this.aid;
	}

	public void setAid(Integer aid) {
		this.aid = aid;
	}

	public String getAname() {
		return this.aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public String getApwd() {
		return this.apwd;
	}

	public void setApwd(String apwd) {
		this.apwd = apwd;
	}

}
