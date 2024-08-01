package by.shevko.springcourse.player;

import by.shevko.springcourse.colorthemes.ColorTheme;
import by.shevko.springcourse.genres.Music;
import by.shevko.springcourse.userdata.UserData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class MusicPlayer1 {

    private Music music;
    private ColorTheme theme;
    @Autowired
    private UserData userData;

    //IoC
//    @Autowired
    public MusicPlayer1(Music music) {
        this.music = music;
    }

    public void playMusic(){
        System.out.println(">>> play music >>> \n" + music.getSong());
    }

//    @Autowired
    public void setTheme(ColorTheme theme) {
        this.theme = theme;
    }

    public void theme() {
        System.out.println("player theme => " + theme.color());
    }

    public void printUserData(){
        System.out.println("user data => " + userData.toString());
    }
}
