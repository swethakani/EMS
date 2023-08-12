package com.employee;
//pojo class
public class Employee {
	private int eid;
	private String ename;
	private double esalary;
	private int eage;
	
	public Employee() {
		
	}
	
	public Employee(int eid,String ename,double esalary,int eage) {
		this.eid=eid;
		this.ename=ename;
		this.esalary=esalary;
		this.eage=eage;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getEsalary() {
		return esalary;
	}
	public void setEsalary(double esalary) {
		this.esalary = esalary;
	}
	public int getEage() {
		return eage;
	}
	public void setEage(int eage) {
		this.eage = eage;
	}
	//if we want to represent the object of a class in a String the we use toString()
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + ", eage=" + eage + "]";
	}
	
	
}
