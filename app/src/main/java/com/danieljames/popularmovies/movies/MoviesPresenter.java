package com.danieljames.popularmovies.movies;


import android.support.annotation.NonNull;

import com.danieljames.popularmovies.data.MovieRepository;

public class MoviesPresenter implements MoviesContract.UserActionListener {

    private MovieRepository movieRepository;

    private MoviesContract.View moviesView;

    public MoviesPresenter(@NonNull MovieRepository movieRepository, @NonNull MoviesContract.View moviesView) {
        this.movieRepository = checkNotNull(movieRepository, "Cannot be null");
        this.moviesView = checkNotNull(moviesView, "Cannot be null");
    }

    @Override
    public void openMovie(int movieId) {

    }
}
