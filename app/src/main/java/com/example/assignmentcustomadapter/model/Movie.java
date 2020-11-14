package com.example.assignmentcustomadapter.model;

public class Movie
{
    private int movieImageId;
    private String title;
    private Float ratings;
    private String description;

    public Movie(int movieImageId, String title, Float ratings, String description) {
        this.movieImageId = movieImageId;
        this.title = title;
        this.ratings = ratings;
        this.description = description;
    }

    public int getMovieImageId() {
        return movieImageId;
    }

    public void setMovieImageId(int movieImageId) {
        this.movieImageId = movieImageId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Float getRatings() {
        return ratings;
    }

    public void setRatings(Float ratings) {
        this.ratings = ratings;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
