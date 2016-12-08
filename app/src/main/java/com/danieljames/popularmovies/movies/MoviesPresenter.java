package com.danieljames.popularmovies.movies;


import android.support.annotation.NonNull;

import com.danieljames.popularmovies.data.Movie;
import com.danieljames.popularmovies.data.MovieRepository;

import java.util.List;

import static com.google.common.base.Preconditions.checkNotNull;

public class MoviesPresenter implements MoviesContract.UserActionListener {

    private MovieRepository movieRepository;

    private MoviesContract.View moviesView;

    public MoviesPresenter(@NonNull MovieRepository movieRepository, @NonNull MoviesContract.View moviesView) {
        this.movieRepository = checkNotNull(movieRepository, "Cannot be null");
        this.moviesView = checkNotNull(moviesView, "Cannot be null");
    }


    @Override
    public void loadMovies(boolean factor) {
        moviesView.setProgresWheel(true);
        movieRepository.showMovies(new MovieRepository.LoadAllMoviesCallBack() {
            @Override
            public void onMoviesLoaded(List<Movie> movies) {
                moviesView.setProgresWheel(false);
                moviesView.showMovies(movies);
            }
        });
    }

    @Override
    public void showMoviesDetailsUi(int movie) {

    }
}
