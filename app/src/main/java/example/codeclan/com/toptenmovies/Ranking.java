package example.codeclan.com.toptenmovies;

import java.lang.reflect.Array;

/**
 * Created by user on 17/04/2017.
 */

public class Ranking {

    private Movie[] movies;

    public Ranking() {
        this.movies = new Movie[10];
    }

    public void setMovie(Movie movie) {
        this.movies[movie.getRanking() -1] = movie;
    }

    public Movie getMovieByRank(int rank) {
        return this.movies[rank-1];
    }

//    public String getTitle(Movie movie) {
//        return this.movies[]
//    }

}
