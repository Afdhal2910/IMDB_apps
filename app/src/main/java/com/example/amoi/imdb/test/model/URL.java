package com.example.amoi.imdb.test.model;

import io.realm.RealmObject;

/**
 * Created by amoi on 5/12/2017.
 */

public class URL extends RealmObject {
    private String url;
    private String year;
    private String title;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
