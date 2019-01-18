package com.lnt.mvc.controller;

import java.util.HashMap;
import java.util.Map;

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
import org.springframework.web.servlet.ModelAndView;

import com.lnt.mvc.exception.CustomException;
import com.lnt.mvc.model.Person;
//import com.lnt.mvc.model.Person;
import com.lnt.mvc.model.Registration;
import com.lnt.mvc.service.RegistrationService;

@Controller
public class RegistrationController {
	@Autowired	
private RegistrationService registrationService;



 
public void setRegistrationService(RegistrationService registrationService) {
	this.registrationService = registrationService;
}
@RequestMapping(value="/institutes")
public String registerdetails(Model model) {
model.addAttribute("institute",new Registration());

return "institute";
}


@RequestMapping(value="/institute/save",
method=RequestMethod.POST)
public String save(
		@ModelAttribute("institute")
		@Valid Registration r,
		BindingResult result,
		Model model) {
		if(!result.hasErrors()) {
			
			
			this.registrationService.save(r);
		}

		return "redirect:/institutes";

}


}
 
		
		


	
	
	
			




