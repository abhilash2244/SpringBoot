package com.ram.model;

public class Employee {

	private String empName;
	private String eid;
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", eid=" + eid + "]";
	}
	
	
}
