package by.shevko.springcourse.player;

import by.shevko.springcourse.enums.Genres;
import by.shevko.springcourse.genres.ClassicalMusic;
import by.shevko.springcourse.genres.Music;
import by.shevko.springcourse.genres.RockMusic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {

    @Autowired
    @Qualifier("classic")
    private Music music1;
    @Autowired
    @Qualifier("rock")
    private Music music2;

//    @Autowired
//    public MusicPlayer(@Qualifier("classic") Music music1, @Qualifier("rock") Music music2) {
//        this.music1 = music1;
//        this.music2 = music2;
//    }

    public String playMusic(Genres genre){
        switch (genre){
            case CLASSICAL: return music1.getSong();
            case ROCK: return music2.getSong();
        }
//        return " playing: " + music1.getSong() + ", " + music2.getSong();
        return null;
    }
}
