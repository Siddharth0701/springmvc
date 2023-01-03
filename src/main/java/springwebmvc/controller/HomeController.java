package springwebmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String home(Model model) {
		System.out.println("this is home url");
		model.addAttribute("name", "Siddharth Kumar Singh");
		model.addAttribute("id", 8070);
		List<String> friends = new ArrayList<String>();
		friends.add("Harsh");
		friends.add("Mohan");
		friends.add("Sohan");
		friends.add("uttam");
		model.addAttribute("f", friends);

		return "index";
	}

	@RequestMapping("/about")
	public String about() {
		System.out.println("this is about page");
		return "about";
	}
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("this is help controller");
		//creating model and view object
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("name", "Uttam Shukla");
		modelAndView.addObject("rollnumber", 123456789);
		LocalDateTime now =LocalDateTime.now();
		modelAndView.addObject("time", now);
		
		
		//setting view name
		modelAndView.setViewName("help");
		return modelAndView;
		
	}

}
