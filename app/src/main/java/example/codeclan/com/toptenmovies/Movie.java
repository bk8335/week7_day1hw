package example.codeclan.com.toptenmovies;


/**
 * Created by user on 17/04/2017.
 */

public class Movie {
    private String title;
    private String genre;
    private Ranking[] currentRanking;

    public Movie(String title, String genre) {
        this.title = title;
        this.genre = genre;
        this.currentRanking = new Ranking[10];
    }

    public String getTitle() {
        return this.title;
    }

    public String getGenre() {
        return this.genre;
    }

    public int getRanking() {
        return this.currentRanking;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setRanking(int ranking) {
        this.currentRanking = ranking;
    }

    public String getDetails() {
        return "Title: " + getTitle() + ", Genre: " + getGenre() + ", Ranking: " + getRanking();
    }
}
