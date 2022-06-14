package mypkg;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {
	
	@Bean
	public Docket swaggerApi() {
		return new Docket(DocumentationType.SWAGGER_2).select().paths(PathSelectors.ant("/products/*")).build()
				.apiInfo(new ApiInfo("my app","to display the name","1.0",
						"https://www.apple.com/legal/internet-services/terms/site.html", 
						new Contact("Kensin","https://www.facebook.com/uthej.karnam.1/",
								"uthejkarnam@gmail.com"),"License Agreement",
						"https://www.apple.com/in/legal/sla/",Collections.EMPTY_LIST));
	}

}
