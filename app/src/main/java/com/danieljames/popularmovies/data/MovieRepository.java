package com.danieljames.popularmovies.data;


import java.util.List;

public interface MovieRepository {

    void showMovies(LoadAllMoviesCallBack callBack);
    void getMovie(GetMovieCallBack callBack);

    interface LoadAllMoviesCallBack{
        void onMoviesLoaded(List<Movie> movies);
    }

    interface GetMovieCallBack{
        void onMovieLoades(Movie requestedMovie);
    }
}
