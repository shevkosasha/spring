package by.shevko.springcourse.genres;

import org.springframework.stereotype.Component;

import java.util.List;

@Component("classic")
public class ClassicalMusic implements Music {

    private List<String> songs = List.of("Fur Elise", "Symphony #40", "Carmen");

    @Override
    public String getSong() {
        return getRandomSongs(songs);
    }
}
