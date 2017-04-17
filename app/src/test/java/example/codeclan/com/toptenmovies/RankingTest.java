package example.codeclan.com.toptenmovies;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 17/04/2017.
 */

public class RankingTest {

    Movie movie1;
    Movie movie2;
    Movie movie3;
    Movie movie4;
    Movie movie5;
    Movie movie6;
    Movie movie7;
    Movie movie8;
    Movie movie9;
    Movie movie10;
    Movie movie11;
    Ranking ranking;

    @Before
    public void before() {
    movie1 = new Movie("a", "action", 1);
    movie2 = new Movie("b", "action", 2);
    movie3 = new Movie("Iron Man", "comic-book", 3);
    movie4 = new Movie("Iron Man 2", "comic-book", 4);
    movie5 = new Movie("Iron Man 3", "comic-book", 5);
    movie6 = new Movie("c", "action", 6);
    movie7 = new Movie("d", "action", 7);
    movie8 = new Movie("e", "action", 8);
    movie9 = new Movie("f", "action", 9);
    movie10 = new Movie("g", "action", 10);
    ranking = new Ranking();
    }


    @Test
    public void setRankingTest() {
        ranking.setMovie(movie3);
        Movie result = ranking.getMovieByRank(3);
        assertEquals("Iron Man", result.getTitle());
    }

    @Test
    public void replaceFinalMovieTest() {
        movie11 = new Movie("this is a new movie", "sci-fi", 4);
        ranking.setMovie(movie11);
        Movie result = ranking.getMovieByRank(4);
        assertEquals("this is a new movie", result.getTitle());
    }

}
