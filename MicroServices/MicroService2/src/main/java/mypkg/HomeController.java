package mypkg;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
@RestController
public class HomeController {

	@Autowired
	private RestTemplate restTemplate;
	
	
	@GetMapping("/home")
	public ModelAndView home() {
		String prod = restTemplate.getForObject("http://PRODUCT-MICROSERVICE/products", String.class);
		ModelAndView mv = new ModelAndView();
		mv.addObject("prod",prod);
		mv.setViewName("chk");
		return mv;
		
	}
	
	@GetMapping("/jsondata")
	public ModelAndView jsondata() {
		RestTemplate restTemplate = new RestTemplate();
		String prod = restTemplate.getForObject("https://jsonplaceholder.typicode.com/users", String.class);
		ModelAndView mv = new ModelAndView();
		mv.addObject("prod",prod);
		mv.setViewName("chk");
		return mv;
		
	}
	
	@GetMapping("/jsonlist")
	public ModelAndView jsonlist() {
		RestTemplate restTemplate = new RestTemplate();
		List prod = restTemplate.getForObject("https://jsonplaceholder.typicode.com/users", List.class);
		prod.forEach(item -> {
			System.out.println(item);
		});
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("prod",prod);
		mv.setViewName("chk");
		return mv;
		
	}
	
	@GetMapping("/prodlist")
	public ModelAndView prodlist() {
		RestTemplate restTemplate = new RestTemplate();
		List prod = restTemplate.getForObject("http://localhost:9199/products", List.class);
		ModelAndView mv = new ModelAndView();
		mv.addObject("prod",prod);
		mv.setViewName("prodlist");
		return mv;
		
	}
}
