package conan.rocks;

import conan.rocks.context.ApplicationConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AspectJDemo {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        LogService logService = context.getBean(IODelayLogService.class);

        for (int i = 0; i < 4; i++) {
            logService.log("log " + i);
            System.out.println("doing stuff " + i + " times");
        }
    }
}
