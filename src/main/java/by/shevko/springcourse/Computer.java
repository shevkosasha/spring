package by.shevko.springcourse;

import by.shevko.springcourse.enums.Genres;
import by.shevko.springcourse.player.MusicPlayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {

    private int id;
    private MusicPlayer musicPlayer;

    @Autowired
    public Computer(MusicPlayer musicPlayer) {
        this.id = 1;
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "id=" + id +
                "},  " +
//                "\n playing random classical:\n " + musicPlayer.playMusic(Genres.CLASSICAL) +
//                "\n playing random rock:\n " + musicPlayer.playMusic(Genres.ROCK) +
                "\n playing random song:\n " + musicPlayer.playMusic();
    }
}
