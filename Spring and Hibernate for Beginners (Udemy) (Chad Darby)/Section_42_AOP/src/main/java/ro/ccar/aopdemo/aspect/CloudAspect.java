package ro.ccar.aopdemo.aspect;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Aspect
@Component
@Order(10)
public class CloudAspect {

    @Before("ro.ccar.aopdemo.aspect.AopExpressions.excludeGettersAndSetters()")
    public void logToCloudAsync() {
        System.out.println("===>>> EXECUTING @Before - LOG TO CLOUD");
    }

}


// getting first in the order of execution