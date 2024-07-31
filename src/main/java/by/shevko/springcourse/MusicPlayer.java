package by.shevko.springcourse;

import java.util.List;

public class MusicPlayer {

    private Music music;
    private List<Music> musicList;
    private String name;
    private int volume;

    public MusicPlayer() {
    }
    //IoC
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public void setMusicList(List<Music> musicList) {
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

    public void playMusic(){
        System.out.println(">>> play music >>> \n" + music.getSong());
    }

    public void playMusicList(){
        System.out.println(">>> play list >>>");
        musicList.stream().forEach(i -> System.out.println(i.getSong()));
    }
}
