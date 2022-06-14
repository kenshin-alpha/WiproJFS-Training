package mypkg;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "feignDemo", url="http://localhost:8087/user")
public interface FeignInterface {
	@GetMapping("/name")
     String getName();
}
