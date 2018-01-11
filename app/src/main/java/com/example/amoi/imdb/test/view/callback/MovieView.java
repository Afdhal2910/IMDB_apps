package com.example.amoi.imdb.test.view.callback;

import com.example.amoi.imdb.test.model.Status;
import io.realm.RealmList;

/**
 * Created by amoi on 27/11/2017.
 */

public interface MovieView {
    void onGetMovieSuccessful(final RealmList<Status> movie);

    void onGetMovieFailure();

}
