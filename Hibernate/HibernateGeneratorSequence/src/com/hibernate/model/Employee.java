package com.hibernate.model;

import java.util.Date;

//POJO Class
public class Employee {
	private int empId; //POJO Identity
	
	//POJO Properties
	private String empName;
	private double empSal;
	private Date joiningDate;
	public Employee() {
		super();
	}
	public Employee(int empId, String empName, double empSal, Date joiningDate) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.joiningDate = joiningDate;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
	public Date getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName
				+ ", empSal=" + empSal + ", joiningDate=" + joiningDate + "]";
	}	
}