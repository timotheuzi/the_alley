package the.alley;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;



@SpringBootApplication
//@EnableOpenApi //Enable open api 3.0.3 spec
public class TheAlleyApplication {
	public static void main(String[] args) {
		SpringApplication.run(TheAlleyApplication.class, args);
	}
	//Docket test = SpringFoxConfig.api();
}