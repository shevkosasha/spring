package by.shevko.springcourse;

import by.shevko.springcourse.player.MusicPlayer2;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

//        ClassicalMusic cLassic = context.getBean("classic", ClassicalMusic.class);
//        Music rock = context.getBean("rock", Music.class);

//        MusicPlayer1 player1 = new MusicPlayer1(cLassic);
//        player1.playMusic();
//        MusicPlayer1 player2 = new MusicPlayer1(List.of(cLassic, rock));
//        player2.playMusicList();

//        MusicPlayer1 player1 = context.getBean("musicPlayer1", MusicPlayer1.class);
//        player1.printUserData();
//        player1.theme();
//        player1.playMusic();

//        MusicPlayer2 player2 = context.getBean("musicPlayer2", MusicPlayer2.class);
//        player2.playMusic();

        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);

        context.close();

    }
}
