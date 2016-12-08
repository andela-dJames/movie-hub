package com.danieljames.popularmovies.data;

import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;

/**
 * Created by danieljames on 12/8/16.
 */
public class MoviesEndPointTest {

    @Mock
    private MovieRepository movieRepository;
    @Mock
    private ServiceEndpoint serviceEndpoint;

    private MoviesEndPoint moviesEndPoint;

    @Captor
    private ArgumentCaptor<MoviesDataCallBack> moviesDataCallBackArgumentCaptor;

    @Before
    public void setUp(){
        MockitoAnnotations.initMocks(this);
        moviesEndPoint = new MoviesEndPoint(movieRepository, serviceEndpoint);
    }

    @Test
    public void serviceGetsListOfMoviesFromApi(){
        fail("Not yet implemented");
    }

    @Test

    public void serviceGetsAMovieFromApi(){
        fail("Not yet Implemented");
    }

}