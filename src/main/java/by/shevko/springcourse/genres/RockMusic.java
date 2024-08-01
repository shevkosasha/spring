package by.shevko.springcourse.genres;

import org.springframework.stereotype.Component;

import java.util.List;

@Component("rock")
public class RockMusic implements Music {

    private List<String> songs = List.of("Wind of Change", "The Unforgiven", "Highway To Hell");

    @Override
    public String getSong() {
        return getRandomSongs(songs);
    }
}
