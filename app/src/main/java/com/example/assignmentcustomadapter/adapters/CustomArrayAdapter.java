package com.example.assignmentcustomadapter.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.assignmentcustomadapter.R;
import com.example.assignmentcustomadapter.model.Movie;

import java.util.ArrayList;

public class CustomArrayAdapter extends BaseAdapter {

    ArrayList<Movie> movies;
    private Integer[] movieImages = {R.drawable.passengers, R.drawable.dhamaal, R.drawable.gangs_of_wasseypur, R.drawable.bahubali};

    public CustomArrayAdapter(ArrayList<Movie> movies)
    {
        this.movies = movies;
    }


    @Override
    public int getCount() {
        return movies.size();
    }

    @Override
    public Movie getItem(int position) {
        return movies.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder viewHolder;

        if(convertView == null){
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.movie_row_layout, null);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        }
        else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        Movie movie = getItem(position);

        viewHolder.titleTv.setText(movie.getTitle());

        String rating = Float.toString(movie.getRatings());
        viewHolder.ratingsTv.setText(rating);

        viewHolder.descriptionTv.setText(movie.getDescription());
        viewHolder.movieIv.setImageResource(movieImages[position]);

        return convertView;
    }

    class ViewHolder{

        TextView titleTv;
        TextView ratingsTv;
        TextView descriptionTv;
        ImageView movieIv;

        public ViewHolder(View view){
            titleTv = view.findViewById(R.id.title_text_view);
            ratingsTv = view.findViewById(R.id.rating_text_view);
            descriptionTv = view.findViewById(R.id.description_text_view);
            movieIv = view.findViewById(R.id.image_view);
        }
    }
}
