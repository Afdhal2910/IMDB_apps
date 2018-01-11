package com.example.amoi.imdb.test;

import android.app.Application;

import io.realm.Realm;
import io.realm.RealmConfiguration;

/**
 * Created by amoi on 29/11/2017.
 */

public class ImdbApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // initialize realm database
        Realm.init(this);
        initRealmConfiguration();

    }

    private void initRealmConfiguration() {
        // When you create a RealmConfiguration you can specify the version of the schema.
        // If the schema does not have that version a RealmMigrationNeededException will be thrown.
        RealmConfiguration realmConfiguration = new RealmConfiguration.Builder()
                .name("default.realm")
                .deleteRealmIfMigrationNeeded()
                .build();

        Realm.setDefaultConfiguration(realmConfiguration);
    }

}
