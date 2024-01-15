package com.demo.bean;

public class StudentBean {
	private int stdId;
	private String stdName;
	public StudentBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentBean(int stdId, String stdName) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
	}
	public int getStdId() {
		return stdId;
	}
	public void setStdId(int stdId) {
		this.stdId = stdId;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	
	

}
