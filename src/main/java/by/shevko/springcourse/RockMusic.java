package by.shevko.springcourse;

import org.springframework.stereotype.Component;

@Component("rock")
public class RockMusic implements Music {

    @Override
    public String getSong() {
        return "Wind cried Mary";
    }
}
