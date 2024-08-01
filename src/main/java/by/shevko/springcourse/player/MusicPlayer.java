package by.shevko.springcourse.player;

import by.shevko.springcourse.enums.Genres;
import by.shevko.springcourse.genres.ClassicalMusic;
import by.shevko.springcourse.genres.Music;
import by.shevko.springcourse.genres.RockMusic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//@Component
public class MusicPlayer {

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

//    @Autowired
//    @Qualifier("classic")
    private Music music1;
//    @Autowired
//    @Qualifier("rock")
    private Music music2;

    private List<Music> musicList = new ArrayList<>();

//    @Autowired
    public MusicPlayer(@Qualifier("classic") Music music1, @Qualifier("rock") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String playMusic(){
        return musicList.get(new Random().nextInt(musicList.size() -1)).getSong();
    }

    public String playMusic(Genres genre){
        switch (genre){
            case CLASSICAL: return music1.getSong();
            case ROCK: return music2.getSong();
        }
        return null;
    }


}
