package com.example.amoi.imdb.test.service.event;

import com.example.amoi.imdb.test.model.Poster;
import com.example.amoi.imdb.test.model.Status;
import io.realm.RealmList;

/**
 * Created by amoi on 27/11/2017.
 */

public class OnMovieEvent extends OnDefaultEvent {

    private RealmList<Status> movie;
    private Poster poster;

    public Poster getPoster() {
        return poster;
    }

    public void setPoster(Poster poster) {
        this.poster = poster;
    }

    public RealmList<Status> getMovie() {
        return movie;
    }

    public void setMovie(RealmList<Status> movie) {
        this.movie = movie;
    }

}
