package com.danieljames.popularmovies.movies;

import com.danieljames.popularmovies.data.Movie;
import com.danieljames.popularmovies.data.MovieRepository;
import com.google.common.collect.Lists;

import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;

/**
 * Created by danieljames on 12/8/16.
 */
public class MoviesPresenterTest {

    private List<Movie> movieList = Lists.newArrayList(new Movie(), new Movie(), new Movie());
    @Mock
    private MovieRepository movieRepository;
    @Mock
    private MoviesContract.View moviesView;

    @Captor
    private ArgumentCaptor<MovieRepository.LoadAllMoviesCallBack> loadAllMoviesCallBackArgumentCaptor;

    private MoviesPresenter moviesPresenter;
    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        moviesPresenter = new MoviesPresenter(movieRepository, moviesView);
    }

    @Test
    public void getMoviesFromRepositoryAndLoadToView(){
        //showprogress
        //capture callback
        //stop progress
        //get movie from repository
        //fail("Not yet implemented");

        moviesPresenter.loadMovies(true);
        verify(movieRepository).showMovies(loadAllMoviesCallBackArgumentCaptor.capture());
        loadAllMoviesCallBackArgumentCaptor.getValue().onMoviesLoaded(movieList);
        verify(moviesView).setProgresWheel(false);
        verify(moviesView).showMovies(movieList);
    }

    @Test
    public void displayMoviesOnUi(){
        fail("Not yet implemented");
    }

}