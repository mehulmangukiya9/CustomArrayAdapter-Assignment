package com.example.assignmentcustomadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.assignmentcustomadapter.adapters.CustomArrayAdapter;
import com.example.assignmentcustomadapter.model.Movie;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listview;
    ArrayList<Movie> movies;

    public ArrayList<Movie> generateMovies(){
        ArrayList<Movie> movies = new ArrayList<>();

        movies.add(new Movie(R.drawable.passengers, "Passenger", (float) 4.5, "This movie is based on space travelling."));
        movies.add(new Movie(R.drawable.dhamaal, "Dhamaal", (float) 5, "This is comedy movie of priyadarshan."));
        return movies;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listview = findViewById(R.id.movie_list_view);
        movies = generateMovies();
        CustomArrayAdapter adapter = new CustomArrayAdapter(movies);
        listview.setAdapter(adapter);
    }
}