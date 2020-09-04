package ro.ccar.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);

        // loading Spring configuration xml file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieving bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);

        // calling method on the bean
        System.out.println(theCoach.getDailyWorkout());

        // calling new methods from dependencies
        System.out.println(theCoach.getDailyFortune());

        // closing the context
        context.close();
    }
}
