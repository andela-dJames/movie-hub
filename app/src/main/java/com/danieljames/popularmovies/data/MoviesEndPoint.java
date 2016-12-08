package com.danieljames.popularmovies.data;

import android.support.annotation.NonNull;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by danieljames on 12/8/16.
 */

public class MoviesEndPoint {

    private static final String QUERY_STRING = "sort_by=popularity.desc?&";
    private MovieRepository movieRepository;

    private ServiceEndpoint serviceEndpoint;

    public MoviesEndPoint(@NonNull MovieRepository movieRepository, @NonNull ServiceEndpoint serviceEndpoint) {
        this.movieRepository = movieRepository;
        this.serviceEndpoint = serviceEndpoint;
    }

    public void getMoviesFromApi(final MoviesDataCallBack callBack){
        final PageResult pageResult;

        Call<PageResult> call = serviceEndpoint.getMovies(QUERY_STRING);
        call.enqueue(new Callback<PageResult>() {
            @Override
            public void onResponse(Call<PageResult> call, Response<PageResult> response) {
                PageResult pageResult1 = response.body();
                callBack.onSuccess(pageResult1);
            }

            @Override
            public void onFailure(Call<PageResult> call, Throwable t) {
                callBack.onError(t.getMessage());

            }
        });

    }
}
