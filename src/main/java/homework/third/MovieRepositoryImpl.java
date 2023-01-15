package homework.third;

import homework.third.repository.MovieRepository;

import static homework.third.repository.MovieRepository.movies;

public class MovieRepositoryImpl implements MovieRepositoryApi {

    static int i = 0;
    @Override
    public void addMovie(Movie movie) {
        MovieRepository.movies[i] = movie;
        i++;
    }

    static int id = 9;
    @Override
    public void deleteMovie(Movie movie) {
        MovieRepository.movies[id] = movie;
        id--;

        // ?
    }

    @Override
    public Movie[] findAll() {
        Movie[] tab = movies;
        int counter = 0;
        for (Movie m : tab) {
            if (m != null)
                counter++;
        }
        Movie[] result = new Movie[counter];

        int index = 0;
        for (Movie m : tab) {
            if (m != null) {
                result[index] = m;
                index++;
            }
        }
        return result;
    }

    @Override
    public void findByTitle(Movie movie) {

        // ?

    }

}
