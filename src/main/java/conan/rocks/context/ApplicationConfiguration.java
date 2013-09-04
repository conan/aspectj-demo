package conan.rocks.context;

import conan.rocks.IODelayLogService;
import conan.rocks.LogService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableLoadTimeWeaving;

@Configuration
@EnableLoadTimeWeaving
public class ApplicationConfiguration {

    @Bean
    public LogService loggingService() {
        return new IODelayLogService();
    }
}
