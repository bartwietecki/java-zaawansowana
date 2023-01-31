package lecture.homework.third;

import lecture.homework.third.repository.MovieRepository;

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

    // P O P R A W N A Metoda void findByTitle
    public void findByTitle(Movie movie) {
        for (Movie m : movies) {
            if(m.getTitle().equals(movie.getTitle())) {
                System.out.println("Znaleziono film:");
                System.out.println("Title: " + movie.getTitle());
                System.out.println("Year of release: " + movie.getYearOfRelease());
                break;
            }
        }
        System.out.println("Movie not found");
    }

    // Metoda ok, ale nie jest voidem

//    public Movie findByTitle(String title) {
//        for (Movie m : movies) {
//            if (m.getTitle().equals(title)){
//                return m;
//            }
//        }
//        return null;
//    }


    // ŹLE - ta metoda nie działa
    /*

    @Override
    public void findByTitle(Movie title) {
        boolean foundedTitle = Arrays.stream(movies).anyMatch(movie -> movie.equals(title));
        System.out.println("Tytuł został znaleziony: " + foundedTitle);
        }

     */

}
