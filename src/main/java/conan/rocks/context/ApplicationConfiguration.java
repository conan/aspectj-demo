package conan.rocks.context;

import conan.rocks.LoggingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {

    @Bean
    public LoggingService loggingService() {
        return new LoggingService();
    }
}
