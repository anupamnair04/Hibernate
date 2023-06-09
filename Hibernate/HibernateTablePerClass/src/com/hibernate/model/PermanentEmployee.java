package com.hibernate.model;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity   @Table(name="pempin2")  @AttributeOverrides({
	@AttributeOverride(column = @Column(name="name_p",length=20), name = "name"),
	@AttributeOverride(column = @Column(name="salary_p"), name = "salary") })
public class PermanentEmployee extends Employee 
{				@Column(length=10)
				private String department;
				@Column(length=20)
				private String designation;	
	public PermanentEmployee() { super(); }
	public PermanentEmployee(int id, String name, double salary) {
		super(id, name, salary); }
	public String getDepartment() { return department; }
	public void setDepartment(String department) {
		this.department = department; }
	public String getDesignation() {
		return designation; }
	public void setDesignation(String designation) {
		this.designation = designation; }
	@Override
	public String toString() {
		return "PermanentEmployee [department=" + department + ", designation="
				+ designation + "]";   }	}