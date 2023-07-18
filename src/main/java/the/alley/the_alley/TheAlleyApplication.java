package the.alley.the_alley;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.config.EnableWebFlux;

//@SpringBootApplication
@EnableWebFlux
public class TheAlleyApplication {

	public static void main(String[] args) {
		SpringApplication.run(TheAlleyApplication.class, args);
	}

}
