package com.hibernate.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hib_empanno")
public class Employee {
	@Id
	@Column(name="eid")
	private int empId; 
	
	@Column(name="ename",length=20)
	private String empName;
	
	@Column
	private double empSal;
	
	@Column(name="jdate")
	private Date joiningDate;
	
	@Embedded
	private Address resAddress;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int empId, String empName, double empSal, Date joiningDate,
			Address resAddress) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.joiningDate = joiningDate;
		this.resAddress = resAddress;
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

	public Address getResAddress() {
		return resAddress;
	}

	public void setResAddress(Address resAddress) {
		this.resAddress = resAddress;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName
				+ ", empSal=" + empSal + ", joiningDate=" + joiningDate
				+ ", resAddress=" + resAddress + "]";
	}	
}