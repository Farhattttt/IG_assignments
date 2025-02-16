package com.insight.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MovieManager {

    public List<Movie> createMovieSet() {
        Scanner scanner = new Scanner(System.in);
        List<Movie> movieList = new ArrayList<>();

        System.out.println("Enter the number of movies:");
        int numberOfMovies = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfMovies; i++) {
            System.out.println("\nEnter details for Movie " + (i + 1) + ":");

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Language: ");
            String language = scanner.nextLine();

            System.out.print("Release Date (dd/MM/yyyy): ");
            String releaseDate = scanner.nextLine();

            System.out.print("Director: ");
            String director = scanner.nextLine();

            System.out.print("Producer: ");
            String producer = scanner.nextLine();

            System.out.print("Duration (in minutes): ");
            int duration = Integer.parseInt(scanner.nextLine());

           
            Movie movie = new Movie(name, language, releaseDate, director, producer, duration);
            movieList.add(movie);
        }

        return movieList;
    }

    
    public void sortByLanguage(List<Movie> movieList) {
        Collections.sort(movieList);
        System.out.println("\nMovies sorted by language:");
        for (Movie movie : movieList) {
            System.out.println(movie);
        }
    }

    
    public void sortByDirector(List<Movie> movieList) {
        Collections.sort(movieList, new SortByDirector());
        System.out.println("\nMovies sorted by director:");
        for (Movie movie : movieList) {
            System.out.println(movie);
        }
    }

    
    public void sortByDuration(List<Movie> movieList) {
        Collections.sort(movieList, (m1, m2) -> Integer.compare(m1.getDuration(), m2.getDuration()));
        System.out.println("\nMovies sorted by duration:");
        for (Movie movie : movieList) {
            System.out.println(movie);
        }
    }

   
    public static void main(String[] args) {
        MovieManager manager = new MovieManager();
        List<Movie> movieList = manager.createMovieSet();

       
        manager.sortByLanguage(movieList);

        
        manager.sortByDirector(movieList);

       
        manager.sortByDuration(movieList);
    }
}




