package by.shevko.springcourse.genres;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("classic")
public class ClassicalMusic implements Music {

    private List<String> songs = List.of("Fur Elise", "Symphony #40", "Carmen");

    @PostConstruct
    public void init(){
        System.out.println("initializing in progress");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("destroying in progress");
    }

    @Override
    public String getSong() {
        return getRandomSongs(songs);
    }
}
