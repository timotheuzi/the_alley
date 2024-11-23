package theAlley;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableOpenApi //Enable open api 3.0.3 spec
public class TheAlley {
    public static void main(String[] args) {
        SpringApplication.run(TheAlley.class, args);
    }
    //Docket test = SpringFoxConfig.api();
}