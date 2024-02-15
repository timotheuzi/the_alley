package the.alley;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger1.annotations.EnableSwagger;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import springfox.documentation.oas.annotations.EnableOpenApi;
import the.alley.config.SpringFoxConfig;

@org.springframework.web.reactive.config.EnableWebFlux
@SpringBootApplication
@EnableOpenApi //Enable open api 3.0.3 spec
public class TheAlleyApplication {
	public static void main(String[] args) {
		SpringApplication.run(TheAlleyApplication.class, args);
	}
	//Docket test = SpringFoxConfig.api();
}