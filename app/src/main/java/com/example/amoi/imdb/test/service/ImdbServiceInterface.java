package com.example.amoi.imdb.test.service;

import com.example.amoi.imdb.test.model.Status;
import io.realm.RealmList;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by amoi on 22/11/2017.
 */

public interface ImdbServiceInterface {


    @GET("find/movie")
    Call<RealmList<Status>> getMovie(@Query("title") String title, @Query("year") final String year);
/*
    @GET("")
    Call<Song> getSong(@Query("artist") String artist, @Query("song") final String song);
*/
}
