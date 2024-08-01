package by.shevko.springcourse;

import by.shevko.springcourse.player.MusicPlayer2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {

    private int id;
    private MusicPlayer2 musicPlayer;

    @Autowired
    public Computer(MusicPlayer2 musicPlayer) {
        this.id = 1;
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "id=" + id +
                " " + musicPlayer.playMusic() +
                '}';
    }
}
