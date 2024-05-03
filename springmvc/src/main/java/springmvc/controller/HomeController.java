package springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/index") 
	public String index(Model model) {      //Wathc Video-6 SpringMVC Model
		System.out.println("this is index url");
		model.addAttribute("Name", "Praveen"); 
		model.addAttribute("id", "3256");
		
		List<String> friends = new ArrayList<String>();
		friends.add("Vandana");
		friends.add("Roshni");
		friends.add("Aarti");
		friends.add("Pooja");
		
		model.addAttribute("f",friends);
		
		return "index";
	}
	@RequestMapping("/about")
	public String about() {
		System.out.println("this is about url");
		return "about";
	}
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("this is help url");
		
		//Creating modeland view object  - Video 7  springmvc
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("name", "Google"); //setting a data
		modelAndView.addObject("prep", "Interview");
		modelAndView.addObject("months", 3);
		modelAndView.setViewName("help"); // setting a page or view name 
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(8);
		list.add(6);
		list.add(1);
		list.add(8);
		modelAndView.addObject("hours", list);
		
		return modelAndView;
	}
	
}
