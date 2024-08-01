package by.shevko.springcourse.colorthemes;

import org.springframework.stereotype.Component;

@Component
public class RedTheme implements ColorTheme{

    @Override
    public String color() {
        return "RED";
    }
}
