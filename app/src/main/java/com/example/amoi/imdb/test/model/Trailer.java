package com.example.amoi.imdb.test.model;

import io.realm.RealmObject;

/**
 * Created by amoi on 5/12/2017.
 */

public class Trailer extends RealmObject {
    private String mimeType;
    private String definition;
    private String videoUrl;

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }
}
