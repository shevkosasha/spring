package by.shevko.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Music cLassic = context.getBean("classic", Music.class);
        Music rock = context.getBean("rock", Music.class);

        MusicPlayer player1 = new MusicPlayer(cLassic);
        player1.playMusic();
        MusicPlayer player2 = new MusicPlayer(List.of(cLassic, rock));
        player2.playMusicList();

        context.close();

    }
}
