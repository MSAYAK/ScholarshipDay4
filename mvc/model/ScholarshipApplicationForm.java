package com.lnt.mvc.model;

import java.util.List;

//import java.io.Serializable;
 

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.web.multipart.MultipartFile;
@Entity
@Table(name="DOCUMENTS_LIST")
public class ScholarshipApplicationForm {	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
private Integer id;
private String studentName;
private String instituteName;
private String dob;
private String emailId;
private int mobileno;
private String studentState;
private int xMarks;
private int xIIMarks;
private int degreeMarks;
private int familyAnnualIncome;
public List<MultipartFile> getFiles() {
	return files;
}
public void setFiles(List<MultipartFile> files) {
	this.files = files;
}
private String caste;
 
private List<MultipartFile> files;




public ScholarshipApplicationForm() {
	super();
}
public ScholarshipApplicationForm(Integer id, String studentName, String instituteName, String dob, String emailId,
		int mobileno, String studentState, int xMarks, int xIIMarks, int degreeMarks, int familyAnnualIncome,
		String caste, long xMarksheet, long xiiMarksSheet, long degreeMarksSheet, long domicile, long incomeCertificate,
		long aadharcard, long casteValidityCertificate) {
	super();
	this.id = id;
	this.studentName = studentName;
	this.instituteName = instituteName;
	this.dob = dob;
	this.emailId = emailId;
	this.mobileno = mobileno;
	this.studentState = studentState;
	this.xMarks = xMarks;
	this.xIIMarks = xIIMarks;
	this.degreeMarks = degreeMarks;
	this.familyAnnualIncome = familyAnnualIncome;
	this.caste = caste;
	 
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public String getInstituteName() {
	return instituteName;
}
public void setInstituteName(String instituteName) {
	this.instituteName = instituteName;
}
public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
}
public String getEmailId() {
	return emailId;
}
public void setEmailId(String emailId) {
	this.emailId = emailId;
}
public int getMobileno() {
	return mobileno;
}
public void setMobileno(int mobileno) {
	this.mobileno = mobileno;
}
public String getStudentState() {
	return studentState;
}
public void setStudentState(String studentState) {
	this.studentState = studentState;
}
public int getxMarks() {
	return xMarks;
}
public void setxMarks(int xMarks) {
	this.xMarks = xMarks;
}
public int getxIIMarks() {
	return xIIMarks;
}
public void setxIIMarks(int xIIMarks) {
	this.xIIMarks = xIIMarks;
}
public int getDegreeMarks() {
	return degreeMarks;
}
public void setDegreeMarks(int degreeMarks) {
	this.degreeMarks = degreeMarks;
}
public int getFamilyAnnualIncome() {
	return familyAnnualIncome;
}
public void setFamilyAnnualIncome(int familyAnnualIncome) {
	this.familyAnnualIncome = familyAnnualIncome;
}
public String getCaste() {
	return caste;
}
public void setCaste(String caste) {
	this.caste = caste;
}
 


}
