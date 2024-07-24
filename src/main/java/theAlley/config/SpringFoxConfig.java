package theAlley.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import theAlley.service.EngineService;

@Configuration
public class SpringFoxConfig {
    @Bean
    public EngineService engineService() {
        return new EngineService(); // rtest
    }
}
