package com.lnt.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lnt.mvc.exception.CustomException;
import com.lnt.mvc.model.MinisterLogin;
import com.lnt.mvc.model.Person;
import com.lnt.mvc.model.Registration;
import com.lnt.mvc.model.ScholarshipApplicationForm;
import com.lnt.mvc.model.StudentRegistration;
import com.lnt.mvc.service.StudentRegistrationService;

@Controller

public class StudentRegistrationController {
private StudentRegistrationService studentRegistrationService;


@Autowired
//@Qualifier(value="studentRegistrationService")
public void setStudentRegistrationService(StudentRegistrationService studentRegistrationService) {
	this.studentRegistrationService = studentRegistrationService;
}


@RequestMapping(value="/student")
public String registerdetails(Model model) {
model.addAttribute("student",new StudentRegistration());

return "student";
}

@RequestMapping(value="/aboutus")
public String aboutus(Model model) {
model.addAttribute("student",new StudentRegistration());

return "aboutus";
}

@RequestMapping(value="/contactus")
public String contactus(Model model) {
model.addAttribute("student",new StudentRegistration());

return "contactus";
}

 
@RequestMapping(value="/login")
public String login(Model model) {
model.addAttribute("student",new StudentRegistration());

return "login";
}

@RequestMapping(value="/post")
public String Form(Model model) {
model.addAttribute("document",new ScholarshipApplicationForm());

return "post";
}


@RequestMapping(value="/student/save",
method=RequestMethod.POST)
public String save(
		@ModelAttribute("student")
		@Valid StudentRegistration s,
		BindingResult result,
		Model model) {
		if(!result.hasErrors()) {
			
	
			System.out.println("I am in controller"+s);
			this.studentRegistrationService.save(s);
		}

		return "redirect:/";

}


@RequestMapping(value="/ilogin")
public String ilogin(Model model) {
model.addAttribute("student",new StudentRegistration());

return "ilogin";
}




 

@RequestMapping(value ="/check", method = RequestMethod.POST)
public String LoginValidation1(Model model,HttpServletRequest req)
{
	Integer aadharno=Integer.valueOf(req.getParameter("aadharno"));
	String password=req.getParameter("password");
	System.out.println(aadharno);
	
	System.out.println("this is password"+password);
	if(studentRegistrationService.verifyUser(aadharno, password))
	{
		System.out.println("success");
		return "dash";
	}
	return "redirect:/";

}

@RequestMapping(value="/MinistryLogin")
public String ministerlogin(Model model) {
model.addAttribute("minister",new MinisterLogin());

return "ilogin";
}

@RequestMapping(value ="/checkminister", method = RequestMethod.POST)
public String MinisterLoginValidation(Model model,HttpServletRequest req)
{
	 String username=req.getParameter("username");
	String password=req.getParameter("password");

	
	System.out.println("this is password"+password);
	if(studentRegistrationService.verifyMinister(username, password))
	{
		System.out.println("success");
		return "MinistryDashBoard";
	}
	return "redirect:/";

}












}