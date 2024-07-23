package the.alley.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringFoxConfig {
    @Bean
    public the.alley.utils.Methods methods() {
        return new the.alley.utils.Methods(); // rtest
    }

}
