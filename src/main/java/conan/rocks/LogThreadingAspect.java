package conan.rocks;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

@Aspect
public class LogThreadingAspect {

    private Executor executor = Executors.newCachedThreadPool();

    @Around("execution(* conan.rocks.LogService.log(..))")
    public void logInNewThread(final ProceedingJoinPoint proceedingJoinPoint) {

        Runnable worker = new Runnable() {
            @Override
            public void run() {
                try {
                    proceedingJoinPoint.proceed();
                } catch (Throwable t) {
                    t.printStackTrace();
                }
            }
        };

        executor.execute(worker);
    }
}
