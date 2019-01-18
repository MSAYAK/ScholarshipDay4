package com.lnt.mvc.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="studentRegistration")
public class StudentRegistration {
	
private String name;
private String dob;
private int mobileno;
private String emailId;
private String InstCode;
@Id
@Column(name="aadhaarno")
private Integer aadharno;
private String ifsc;
private int accno;
private String bankName;
private String password;
private String C_Password;
@ManyToOne(cascade=CascadeType.ALL)


private Registration register;

public StudentRegistration() {
	super();
}







public StudentRegistration(String name, String dob, int mobileno, String emailId, String InstCode, Integer aadharno,
		String ifsc, int accno, String bankName, String password, String c_Password, Registration register) {
	super();
	this.name = name;
	this.dob = dob;
	this.mobileno = mobileno;
	this.emailId = emailId;
	this.InstCode = InstCode;
	this.aadharno = aadharno;
	this.ifsc = ifsc;
	this.accno = accno;
	this.bankName = bankName;
	this.password = password;
	this.C_Password = c_Password;
	this.register = register;
}







public Registration getRegister() {
	return register;
}







public void setRegister(Registration register) {
	this.register = register;
}







public String getName() {
	return name;
}



public void setName(String name) {
	this.name = name;
}



public String getDob() {
	return dob;
}



public void setDob(String dob) {
	this.dob = dob;
}



public int getMobileno() {
	return mobileno;
}



public void setMobileno(int mobileno) {
	this.mobileno = mobileno;
}



public String getEmailId() {
	return emailId;
}



public void setEmailId(String emailId) {
	this.emailId = emailId;
}



public String getInstCode() {
	return InstCode;
}



public void setInstCode(String InstCode) {
	InstCode = InstCode;
}



public Integer getAadharno() {
	return aadharno;
}



public void setAadharno(Integer aadharno) {
	this.aadharno = aadharno;
}



public String getIfsc() {
	return ifsc;
}



public void setIfsc(String ifsc) {
	this.ifsc = ifsc;
}



public int getAccno() {
	return accno;
}



public void setAccno(int accno) {
	this.accno = accno;
}



public String getBankName() {
	return bankName;
}



public void setBankName(String bankName) {
	this.bankName = bankName;
}



public String getPassword() {
	return password;
}



public void setPassword(String password) {
	this.password = password;
}



public String getC_Password() {
	return C_Password;
}



public void setC_Password(String c_Password) {
	C_Password = c_Password;
}







@Override
public String toString() {
	return "StudentRegistration [name=" + name + ", dob=" + dob + ", mobileno=" + mobileno + ", emailId=" + emailId
			+ ", InstCode=" + InstCode + ", aadharno=" + aadharno + ", ifsc=" + ifsc + ", accno=" + accno + ", bankName="
			+ bankName + ", password=" + password + ", C_Password=" + C_Password + ", register=" + register + "]";
}







 
 

	

}
