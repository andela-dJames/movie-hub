package com.danieljames.popularmovies.movies;


import android.support.annotation.NonNull;

import com.danieljames.popularmovies.data.Movie;

import java.util.List;


public interface MoviesContract {



    interface View{
        void setProgresWheel(boolean forceUpdate);
        void showMovies(List<Movie> movieList);
        void showMovieDetals(@NonNull Movie requestedMovie);
        void refresh();

    }

    interface UserActionListener{
        void loadMovies(boolean factor);
        void showMoviesDetailsUi(int movie);
    }
}
