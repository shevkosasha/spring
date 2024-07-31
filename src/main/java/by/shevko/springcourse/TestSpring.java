package by.shevko.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Music cLassic = context.getBean("musicBeanCLassic", Music.class);
        Music rock = context.getBean("musicBeanRock", Music.class);

        MusicPlayer player1 = context.getBean("musicPlayer1", MusicPlayer.class);
        player1.playMusic();
        MusicPlayer player2 = context.getBean("musicPlayer2", MusicPlayer.class);
        player2.playMusic();
        System.out.println(String.format("name: %s, volume %d", player2.getName().toUpperCase(), player2.getVolume()));

        context.close();

    }
}
