package mypkg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/feign-communication")
public class FeignController {

	@Autowired
	private FeignInterface feignInterface;
	
	@GetMapping("/username")
	public String getName() {
		return feignInterface.getName();
	}
}
