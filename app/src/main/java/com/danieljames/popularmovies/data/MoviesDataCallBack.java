package com.danieljames.popularmovies.data;

/**
 * Created by danieljames on 12/8/16.
 */

public interface MoviesDataCallBack {
    void onSuccess(PageResult pageResult);
    void onError(String ErrorMessage);
}
