package com.danieljames.popularmovies.data;


import com.danieljames.popularmovies.Constant;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

    private static OkHttpClient.Builder okhttp = new OkHttpClient.Builder();

    private static Retrofit builder = new Retrofit.Builder()
            .baseUrl(Constant.TMDB_BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(okhttp.build())
            .build();

    public static <S> S createService(Class<S> seviceClass){
        return builder.create(seviceClass);
    }
}

