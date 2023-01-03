package springwebmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/home")
	public String home() {
		System.out.println("this is home url");
		
		return "index";
	}
	@RequestMapping("/")
	public String about() {
		System.out.println("this is about page");
		return "about";
	}

}
