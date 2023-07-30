package the.alley;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import the.alley.config.SpringFoxConfig;

@SpringBootApplication
@EnableSwagger2
public class TheAlleyApplication {
	public static void main(String[] args) {
		SpringApplication.run(TheAlleyApplication.class, args);
	}
	//Docket test = SpringFoxConfig.api();
}