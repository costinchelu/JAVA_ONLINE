package section8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class TennisCoach implements Coach {

    private FortuneService fortuneService;


    // constructor dependency injection through annotations (optional from Spring 4.3)
    @Autowired
    public TennisCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Tennis practice";
    }

    @Override
    public String getDailyFortune() {
        return "Tennis coach -> " + fortuneService.getFortune();
    }
}
