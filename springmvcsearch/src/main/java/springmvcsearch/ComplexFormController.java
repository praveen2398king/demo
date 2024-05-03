package springmvcsearch;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvcsearch.model.Student;

@Controller
public class ComplexFormController {

	@RequestMapping(path="/complex")
	public String showForm() {
		return "complex";
	}
	
	@RequestMapping(path="/handleform", method=RequestMethod.POST)
	public String formHandler(@ModelAttribute Student student, BindingResult bindingResult ) {

		if(bindingResult.hasErrors()) {
			return "complex";
		}
		
		return "success";
	}
}
