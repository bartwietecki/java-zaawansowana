package homework.third;

public class Movie implements MovieRepositoryApi {

    public static void main(String[] args) {


    }

    private String title;
    private int yearOfRelease;

    public Movie(String title, int yearOfRelease) {
        this.title = title;
        this.yearOfRelease = yearOfRelease;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    @Override
    public void addMovie(Movie movie) {
    }

    @Override
    public void deleteMovie(Movie movie) {
    }

    @Override
    public Movie[] findAll() {
        return new Movie[0];
    }

    @Override
    public void findByTitle(Movie movie) {
    }
}
