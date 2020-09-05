package section8;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@SpringBootApplication
public class DemoAnnotations2 {

    public static void main(String[] args) {

        // read Sring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");

        // get the bean from the Spring container
        Coach theCoach = context.getBean("tennisCoach", Coach.class);

        // call a method on the bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        // close the context
        context.close();
    }
}
