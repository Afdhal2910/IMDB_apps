package com.example.amoi.imdb.test.service.event;

import com.example.amoi.imdb.test.model.ResponseError;
import com.example.amoi.imdb.test.service.HttpStatus;

import retrofit2.Response;

/**
 * Created by amoi on 27/11/2017.
 */

public class OnDefaultEvent {
    private Object mObject;
    private Integer code;
    private String message;
    private String event;

    public OnDefaultEvent(final Object object) {
        mObject = object;
    }

    public OnDefaultEvent() {
    }

    public Object getObject() {
        return mObject;
    }

    public void setSuccess() {
        code = HttpStatus.SC_OK;
    }

    public void setFail() {
        code = HttpStatus.SC_BAD_REQUEST;
    }

    public void setUnauthorized() {
        code = HttpStatus.SC_FORBIDDEN;
    }

    public void setEvent(final String event) {
        this.event = event;
    }

    public void setResponse(final Response response) {
        if (response != null) {
            code = response.code();
            message = response.message();
        }
    }

    public void setResponseError(final ResponseError error) {
        //code = error == null ? 0 : error.code();
        message = error == null ? "" : error.getMessage();
    }

    public boolean isSuccess() {
        if (code != null) {
            switch (code) {
                case HttpStatus.SC_OK:
                case HttpStatus.SC_ACCEPTED:
                case HttpStatus.SC_NO_CONTENT:
                    return true;
            }
        }
        return false;
    }

    public boolean isBadRequest() {
        if (code != null) {
            switch (code) {
                case HttpStatus.SC_BAD_REQUEST:
                    return true;
            }
        }
        return false;
    }

    public boolean isUnprocessableEntity() {
        if (code != null) {
            switch (code) {
                case HttpStatus.SC_UNPROCESSABLE_ENTITY:
                    return true;
            }
        }
        return false;
    }

    public boolean isAuthorizationError() {
        if (code != null) {
            switch (code) {
                case HttpStatus.SC_UNAUTHORIZED:
                case HttpStatus.SC_FORBIDDEN:
                    return true;
            }
        }

        return false;
    }

    public String getEvent() {
        return event;
    }

    public String getMessage() {
        return message;
    }

    public Integer getHttpStatus() {
        return code;
    }
}
