package Day_4;

class Movie {
     String movieTitle;
     String genre;
     int duration; 
     double rating; 

    public Movie(String movieTitle, String genre, int duration, double rating) {
        this.movieTitle = movieTitle;
        this.genre = genre;
        this.duration = duration;
        this.rating = rating;
    }

    public String getMovieTitle() {
        return movieTitle;
    }
}

public class Movies {
    public static void main(String[] args) {
        Movie[] movieList = {
            new Movie("Inception", "Sci-Fi", 148, 8.8),
            new Movie("The Godfather", "Crime", 175, 9.2),
            new Movie("The Dark Knight", "Action", 152, 9.0)
        };

        viewMovieTitles(movieList);
    }

    public static void viewMovieTitles(Movie[] movies) {
        System.out.println("Movie Titles:");
        for (Movie movie : movies) {
            System.out.println(movie.getMovieTitle());
        }
    }
}