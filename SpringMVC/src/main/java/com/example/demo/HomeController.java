package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("myapp")
public class HomeController {
	@Value("${server.port}")
	public String port;
	
	
	@GetMapping("/demo")
	public String getSpringMVC() {
		return port;
	}
	
	@GetMapping("/demo/next")
	public String getSecondPage() {
		return "Second page";
	}
	
	@RequestMapping("name")
	public String home(HttpServletRequest req) {
		HttpSession session = req.getSession();
		String namevar = req.getParameter("name");
		System.out.println(namevar);
		session.setAttribute("namevar", namevar);
		
		return "Home";
	}
	
	@RequestMapping("aboutUS")
	public String aboutUS(HttpServletRequest req) {
		HttpSession session = req.getSession();
		String city = req.getParameter("city");
		System.out.println(city);
		session.setAttribute("name", city);
		return "city";
	}
	
	@RequestMapping("mvc")
	public ModelAndView mvc(HttpServletRequest req) {
		HttpSession session = req.getSession();
		String city = req.getParameter("city");
		ModelAndView mv = new ModelAndView();
		mv.addObject("city", city);
		mv.setViewName("city");
		System.out.println(city);
		session.setAttribute("name", city);
		return mv;
	}
}
