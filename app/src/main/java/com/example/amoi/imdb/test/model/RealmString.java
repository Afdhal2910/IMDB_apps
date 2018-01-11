package com.example.amoi.imdb.test.model;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by amoi on 21/11/2017.
 */

public class RealmString  extends RealmObject {
    @PrimaryKey
    private String value;

    public RealmString() {
    }

    public RealmString(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
