package src.main.java.com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class StudentController
{
	
	
	@GetMapping("/")
	public String homepage()
	{
		return "home";
	}
	
}
