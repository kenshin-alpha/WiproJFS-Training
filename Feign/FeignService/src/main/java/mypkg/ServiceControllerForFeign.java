package mypkg;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class ServiceControllerForFeign {

	@GetMapping("/name")
	public String getName() {
		return "Kenshin";
	}
	
	
	@GetMapping("/Status")
	public String getStatus() {
		return "Happy";
	}
	
}
