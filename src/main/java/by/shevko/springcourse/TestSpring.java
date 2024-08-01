package by.shevko.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Music music = context.getBean("musicBean", Music.class);
//        Music cLassic = context.getBean("musicBeanCLassic", Music.class);
//        Music rock = context.getBean("musicBeanRock", Music.class);

        MusicPlayer player1 = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer player2 = context.getBean("musicPlayer", MusicPlayer.class);
//
//        player1.setMusicList(List.of(new RockMusic(), new ClassicalMusic()));
//        player2.setMusicList(List.of(new Music() {
//            @Override
//            public String getSong() {
//                return "Scatman";
//            }
//        }, new ClassicalMusic()));
//        player2.setName("Specific Player");
//        player2.setVolume(4);
//
//
//        player1.playMusicList();
//        System.out.println(String.format("name: %s, volume %d", player1.getName().toUpperCase(), player1.getVolume()));
//        player2.playMusicList();
//        System.out.println(String.format("name: %s, volume %d", player2.getName().toUpperCase(), player2.getVolume()));

        context.close();
    }
}
