package springwebmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HelloWorldController {
	//need a controller method show the initial form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	//need a controller method to prpocess the html form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	//Create new contoller method to read from the data
	//add data to the controller
	
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request,Model model) {
		//read the request form the html form
		String theName=request.getParameter("studentName");
		//convert the data all caps
		theName=theName.toUpperCase();
		//create the message
		String result="Yo!"+theName;
				
		//add message to the model
		model.addAttribute("message", result);
		
		return "helloworld";
		
	}
	

}
