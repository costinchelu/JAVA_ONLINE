package section10.services;

import org.springframework.stereotype.Component;


@Component
public class HappyFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "HappyFortuneService: Happy day!";
    }
}
