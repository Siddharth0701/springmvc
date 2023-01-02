package springwebmvc.controller;

import org.springframework.stereotype.Controller;
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
//	public String letsShoutDude(HttpServletRequest request,Model model) {
//		
//	}
	

}
