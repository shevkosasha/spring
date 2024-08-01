package by.shevko.springcourse.player;

import by.shevko.springcourse.genres.ClassicalMusic;
import by.shevko.springcourse.genres.RockMusic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer2 {

    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;

    @Autowired
    public MusicPlayer2(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    public String playMusic(){
        return " playing: " + classicalMusic.getSong();
//        System.out.println(" playing: " + classicalMusic.getSong());
//        System.out.println(" playing: " + rockMusic.getSong());
    }
}
