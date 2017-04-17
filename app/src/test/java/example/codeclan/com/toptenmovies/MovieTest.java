package example.codeclan.com.toptenmovies;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 17/04/2017.
 */

public class MovieTest {

    Movie movie1;
    Movie movie2;

    @Before
    public void before() {
    movie1 = new Movie("Lord of the Rings: Fellowship of the Ring", "Fantasy", 1);
    movie2 = new Movie("Ghost in the Shell", "Sci-fi", 2);
    }

    @Test
    public void getMovieTitleTest() {
        assertEquals("Ghost in the Shell", movie2.getTitle() );
    }

    @Test
    public void getMovieGenreTest() {
        assertEquals("Fantasy", movie1.getGenre() );
    }

    @Test
    public void getMovieRankingTest() {
        assertEquals(1, movie1.getRanking() );
    }

    @Test
    public void setMovieTitleTest() {
        movie1.setTitle("LoTR: Fellowship of the Ring");
        assertEquals("LoTR: Fellowship of the Ring", movie1.getTitle() );
    }

    @Test
    public void setNewGenreTest() {
        movie1.setGenre("epic");
        assertEquals("epic", movie1.getGenre());
    }

    @Test
    public void setNewRanking() {
        movie2.setRanking(7);
        assertEquals(7, movie2.getRanking() );
    }

    @Test
    public void getMovieDetailsTest() {
        String result = movie2.getDetails();
        assertEquals("Movie: Ghost in the Shell, Genre: Sci-fi, Ranking: 2", result);
    }


}
