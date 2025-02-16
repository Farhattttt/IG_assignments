package com.insight.core;



	import java.util.*;
	import java.text.*;

	public class Movie implements Comparable<Movie> {
	    String name;
	    String language;
	    String releaseDate;
	    String director;
	    String producer;
	    int duration;  

	    
	    public Movie(String name, String language, String releaseDate, String director, String producer, int duration) {
	        this.name = name;
	        this.language = language;
	        this.releaseDate = releaseDate;
	        this.director = director;
	        this.producer = producer;
	        this.duration = duration;
	    }

	    // Getters for the fields
	    public String getName() {
	        return name;
	    }

	    public String getLanguage() {
	        return language;
	    }

	    public String getReleaseDate() {
	        return releaseDate;
	    }

	    public String getDirector() {
	        return director;
	    }

	    public String getProducer() {
	        return producer;
	    }

	    public int getDuration() {
	        return duration;
	    }

	   
	    @Override
	    public int compareTo(Movie other) {
	        return this.language.compareTo(other.language);
	    }

	    @Override
	    public String toString() {
	        return "Name: " + name + ", Language: " + language + ", Release Date: " + releaseDate +
	               ", Director: " + director + ", Producer: " + producer + ", Duration: " + duration + " minutes";
	    }
	}

	class SortByDirector implements Comparator<Movie> {
	    
	    @Override
	    public int compare(Movie m1, Movie m2) {
	        return m1.getDirector().compareTo(m2.getDirector());
	    }
	}

	 

