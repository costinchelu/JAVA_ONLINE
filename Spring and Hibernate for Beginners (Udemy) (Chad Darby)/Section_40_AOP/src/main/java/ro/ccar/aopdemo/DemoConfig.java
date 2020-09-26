package ro.ccar.aopdemo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


// Spring pure Java configuration - component scan for component and aspects (enabling Spring AOP Proxy Support)

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("ro.ccar.aopdemo")
public class DemoConfig {
}
