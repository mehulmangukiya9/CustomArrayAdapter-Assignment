package com.example.assignmentcustomadapter.model;

import android.widget.ImageView;

import com.example.assignmentcustomadapter.R;

public class Movie
{
    private int image;
    private String title;
    private Float ratings;
    private String description;

    public Movie(int image, String title, Float ratings, String description) {
        this.image = image;
        this.title = title;
        this.ratings = ratings;
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
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
