package com.danieljames.popularmovies.data;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ServiceEndpoint {

    @GET("/discover/movie?")
    Call<PageResult> getMovies(@Query("q")  String queryString);

}
