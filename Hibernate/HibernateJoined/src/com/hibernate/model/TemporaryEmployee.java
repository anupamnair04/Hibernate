package com.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="childjoined_temp")
@PrimaryKeyJoinColumn(name="t_id")
public class TemporaryEmployee extends Employee {

	@Column(length=20)
	private String contractorname;
	@Column
	private int workingdays;
	
	public String getContractorname() {
		return contractorname;
	}
	public void setContractorname(String contractorname) {
		this.contractorname = contractorname;
	}
	public int getWorkingdays() {
		return workingdays;
	}
	public void setWorkingdays(int workingdays) {
		this.workingdays = workingdays;
	}
	@Override
	public String toString() {
		return "TemporaryEmployee [contractorname=" + contractorname
				+ ", workingdays=" + workingdays + "]";
	}	
}