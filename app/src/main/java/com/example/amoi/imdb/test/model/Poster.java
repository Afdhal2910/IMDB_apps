package com.example.amoi.imdb.test.model;

import io.realm.RealmObject;

/**
 * Created by amoi on 5/12/2017.
 */

public class Poster extends RealmObject {

    private String large;
    private String thumb;

    public String getLarge() {
        return large;
    }

    public void setLarge(String large) {
        this.large = large;
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }
}
