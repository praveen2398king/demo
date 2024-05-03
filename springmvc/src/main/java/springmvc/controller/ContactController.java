package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {
	
	@Autowired
	private UserService userService;
	
	@ModelAttribute
	public void commonDataForModel(Model m) {
		m.addAttribute("Header", "LearnCode");
		m.addAttribute("desc", "3 months for prep");
		
	}

	@RequestMapping("/contact")
	public String showForm() {
		return "contact";
	}

	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user, Model model) {
        
		//watch video-13 from spring mvc for user understanding		     
        System.out.println(user);  
        //process
        
        if(user.getEmail().isBlank()) {
        	return "redirect:/contact";
        }
        
        int createdUser = this.userService.createUser(user);
        model.addAttribute("Success", "User created with ID" + createdUser);
		return "success";
	}
	
	/*
	 * @RequestMapping(path = "/processform", method = RequestMethod.POST) public
	 * String handleForm(@RequestParam("email") String
	 * userEmail, @RequestParam("userName") String userName,
	 * 
	 * @RequestParam("password") String userPassword, Model model) {
	 * 
	 * //watch video-13 from spring mvc for user understanding
	 * 
	 * User user = new User(); user.setEmail(userEmail); user.setUserName(userName);
	 * user.setPassword(userPassword);
	 * 
	 * System.out.println(user);
	 * 
	 * //process
	 * 
	 * // model.addAttribute("name", userName); //model.addAttribute("email",
	 * userEmail); //model.addAttribute("password", userPassword);
	 * model.addAttribute("user", user); return "success"; }
	 */


}
