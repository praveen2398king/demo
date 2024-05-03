package springmvcsearch;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {
	
    @RequestMapping("/user/{userId}")
	public String getUserDetails(@PathVariable("userId") int usrId) {
    	System.out.println(usrId);
		return "home";
	}
	
	@RequestMapping("/home")
	public String home() {
		System.out.println("Going to home views");
		return "home";
	}

	@RequestMapping("/search")
	public RedirectView seacrh(@RequestParam("querybox") String query) {

		String url = "https://www.google.com/search?q=" + query;

		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(url);

		if (query.isBlank()) {
			redirectView.setUrl("home");
		}

		return redirectView;
	}

}
