package lecture.homework.third;

import lecture.homework.third.repository.MovieRepository;

import java.util.Arrays;

import static lecture.homework.third.repository.MovieRepository.movies;

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

        // nie wiem czy dobrze ?
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

    // ŹLE - ta metoda nie działa
    @Override
    public void findByTitle(Movie title) {
        boolean foundedTitle = Arrays.stream(movies).anyMatch(movie -> movie.equals(title));
        System.out.println("Tytuł został znaleziony: " + foundedTitle);
        }

}
