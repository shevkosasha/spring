package by.shevko.springcourse.configs;

import by.shevko.springcourse.Computer;
import by.shevko.springcourse.genres.ClassicalMusic;
import by.shevko.springcourse.genres.JazzMusic;
import by.shevko.springcourse.genres.Music;
import by.shevko.springcourse.genres.RockMusic;
import by.shevko.springcourse.player.MusicPlayer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.List;

@Configuration
//@ComponentScan("by.shevko.springcourse")
@PropertySource("classpath:player.properties")
public class SpringConfig {

    @Bean
    public ClassicalMusic classic(){
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rock(){
        return new RockMusic();
    }

    @Bean
    public JazzMusic jazz(){
        return new JazzMusic();
    }

    @Bean
    public MusicPlayer musicPlayer(){
//        return new MusicPlayer(classic(), rock());
        return new MusicPlayer(List.of(classic(), jazz(), rock()));
    }

    @Bean
    public Computer computer(){
        return new Computer(musicPlayer());
    }
}
