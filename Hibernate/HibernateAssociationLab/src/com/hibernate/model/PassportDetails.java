package com.hibernate.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="hib_passportdetail")
public class PassportDetails {

	@Id
	@Column(name="custid")
	private int customerId;
	
	@Column(name="pno")	
	private int passportNumber;
	
	@Column(name="fname",length=15)
	private String firstname;
	
	@Column(name="mname",length=15)
	private String middlename;
	
	@Column(name="lname",length=15)
	private String lastname;      
	
	@Column(name="bdate")
	private Date birthDate;
	
	@Column(name="gen",length=15)
	private String gender;
	
	@Column(name="nat",length=15)
	private String nationality;
	
	@Column(name="councode",length=5)
	private int countrycode;
	
	@Column(name="expdate")
	private Date expiryDate;
	
	@Column(name="issdate")
	private Date issueDate;
	
	@Column(name="bplace",length=15)
	private String birthplace;   
	
	@OneToOne
	@PrimaryKeyJoinColumn
	//@JoinColumn(name="eid_fk")
	private Customer cust;

	public PassportDetails(){
		
	}
	
	public PassportDetails(int customerId, int passportNumber, String firstname, String middlename, String lastname,
		Date birthDate, String gender, String nationality, int countrycode, Date expiryDate, Date issueDate,
		String birthplace) {
		super();
		this.customerId = customerId;
		this.passportNumber = passportNumber;
		this.firstname = firstname;
		this.middlename = middlename;
		this.lastname = lastname;
		this.birthDate = birthDate;
		this.gender = gender;
		this.nationality = nationality;
		this.countrycode = countrycode;
		this.expiryDate = expiryDate;
		this.issueDate = issueDate;
		this.birthplace = birthplace;
	}
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public int getPassportNumber() {
		return passportNumber;
	}
	public void setPassportNumber(int passportNumber) {
		this.passportNumber = passportNumber;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getMiddlename() {
		return middlename;
	}
	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public int getCountrycode() {
		return countrycode;
	}
	public void setCountrycode(int countrycode) {
		this.countrycode = countrycode;
	}
	public Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	public Date getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}
	public String getBirthplace() {
		return birthplace;
	}
	public void setBirthplace(String birthplace) {
		this.birthplace = birthplace;
	}
	public Customer getCust() {
		return cust;
	}
	public void setCust(Customer cust) {
		this.cust = cust;
	}
	
	@Override
	public String toString() {
	return "PassportDetails [customerId=" + customerId + ", passportNumber=" + passportNumber + ", firstname="
	+ firstname + ", middlename=" + middlename + ", lastname=" + lastname + ", birthDate=" + birthDate
	+ ", gender=" + gender + ", nationality=" + nationality + ", countrycode=" + countrycode
	+ ", expiryDate=" + expiryDate + ", issueDate=" + issueDate + ", birthplace=" + birthplace + ", cust="
	+ cust + "]";
	}
}