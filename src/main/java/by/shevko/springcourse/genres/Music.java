package by.shevko.springcourse.genres;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public interface Music {

    default String getSong(){
        return "n/a";
    };

    default String getRandomSongs(List<String> songs){
        return songs.get(new Random().nextInt(songs.size() -1));
    };
}
