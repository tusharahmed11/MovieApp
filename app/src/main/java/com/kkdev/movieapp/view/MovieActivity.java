package com.kkdev.movieapp.view;

import android.content.Intent;
import android.os.Bundle;

import com.bumptech.glide.Glide;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingUtil;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.kkdev.movieapp.R;
import com.kkdev.movieapp.databinding.ActivityMovieBinding;
import com.kkdev.movieapp.model.Movie;

public class MovieActivity extends AppCompatActivity {

    private Movie movie;

    private ActivityMovieBinding activityMovieBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie);
        activityMovieBinding = DataBindingUtil.setContentView(this,R.layout.activity_movie);
        Toolbar toolbar = activityMovieBinding.toolbar;
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);






        Intent intent = getIntent();
        if (intent.hasExtra("movie")){
            movie = getIntent().getParcelableExtra("movie");
            activityMovieBinding.setMovie(movie);
            //Toast.makeText(this, movie.getOriginalTitle(), Toast.LENGTH_SHORT).show();
//            image = movie.getPosterPath();
//            String path = "https://image.tmdb.org/t/p/w500"+image;
//
//            Glide.with(this)
//                    .load(path)
//                    .placeholder(R.drawable.loading)
//                    .into(movieImage);
            getSupportActionBar().setTitle(movie.getTitle());



        }

    }

}
