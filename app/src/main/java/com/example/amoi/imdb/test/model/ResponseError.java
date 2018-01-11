package com.example.amoi.imdb.test.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by amoi on 27/11/2017.
 */

public class ResponseError {
    @SerializedName("status")
    private Boolean status;

    @SerializedName("message")
    private String message;

    public ResponseError() {
    }

    public Boolean getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }
}
