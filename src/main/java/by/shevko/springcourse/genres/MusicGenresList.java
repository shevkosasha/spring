package by.shevko.springcourse.genres;

import java.util.List;

public class MusicGenresList {
    private List<Music> genres;

    public MusicGenresList(List<Music> genres) {
        this.genres = genres;
    }

    public List<Music> getGenres() {
        return genres;
    }

    public void setGenres(List<Music> genres) {
        this.genres = genres;
    }
}
