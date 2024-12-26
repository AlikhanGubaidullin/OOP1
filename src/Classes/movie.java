package Classes;

public class movie {
    private String movieTitle;
    private int movieYear;
    private String movieGenre;

    public movie(){}
    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String title) {
        this.movieTitle = title;
    }

    public int getMovieYear() {
        return movieYear;
    }

    public void setMovieYear(int year) {
        this.movieYear = year;
    }

    public String getMovieGenre() {
        return movieGenre;
    }
    public void setMovieGenre(String genre) {
        this.movieGenre = genre;
    }

}