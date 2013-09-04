package conan.rocks;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class IODelayLogService implements LogService {

    @Override
    public void log(String message) {
        fakeIODelay();
        System.out.println(message);
    }

    private void fakeIODelay() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.err.println("Interrupted!  Oh noes!");
        }
    }
}
