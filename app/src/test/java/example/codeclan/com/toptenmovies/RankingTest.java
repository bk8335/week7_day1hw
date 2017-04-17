package example.codeclan.com.toptenmovies;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 17/04/2017.
 */

public class RankingTest {

    Movie movie3;
    Movie movie4;
    Movie movie5;
    Ranking ranking;

    @Before
    public void before() {
    movie3 = new Movie("Iron Man", "comic-book", 4);
    movie4 = new Movie("Iron Man 2", "comic-book", 5);
    movie5 = new Movie("Iron Man 3", "comic-book", 8);
    ranking = new Ranking();
    }


    @Test
    public void setRankingTest() {
        ranking.setMovie(movie3);
        Movie result = ranking.getMovieByRank(4);
        assertEquals("Iron Man", result.getTitle());
    }

}
