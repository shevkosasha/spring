package by.shevko.springcourse;

import java.util.List;

public class MusicPlayer {

    private Music music;
    private List<Music> musicList;

//    public MusicPlayer() {
//    }

    //IoC
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void playMusic(){
        System.out.println(">>> play music >>> \n" + music.getSong());
    }

    public void playMusicList(){
        System.out.println(">>> play list >>>");
        musicList.stream().forEach(i -> System.out.println(i.getSong()));
    }
}
