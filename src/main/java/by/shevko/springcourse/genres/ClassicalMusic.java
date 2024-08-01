package by.shevko.springcourse.genres;

import org.springframework.stereotype.Component;

@Component("classic")
public class ClassicalMusic implements Music {

    @Override
    public String getSong() {
        return "Hungarian rhapsody";
    }
}
