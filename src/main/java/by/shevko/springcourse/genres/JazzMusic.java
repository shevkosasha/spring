package by.shevko.springcourse.genres;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

import java.util.List;

public class JazzMusic implements Music{
    private List<String> songs = List.of("Georgia im My Mind", "My Funny Valentine", "Summertime");

    @Override
    public String getSong() {
        return getRandomSongs(songs);
    }
}
