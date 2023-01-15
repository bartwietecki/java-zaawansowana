package homework.third;

public interface MovieRepositoryApi {

    void addMovie(Movie movie);

    void deleteMovie(Movie movie);

    Movie[] findAll();

    void findByTitle(Movie movie);
}
