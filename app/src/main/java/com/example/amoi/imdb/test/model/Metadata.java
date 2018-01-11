package com.example.amoi.imdb.test.model;

import io.realm.RealmList;
import io.realm.RealmObject;

/**
 * Created by amoi on 5/12/2017.
 */

public class Metadata extends RealmObject {
    private RealmList<RealmString> languages;
    private String aspRetio;
    private RealmList<RealmString> filmingLocations;
    private RealmList<RealmString> alsoKnownAs;
    private RealmList<RealmString> countries;
    private String gross;
    private RealmList<RealmString> soundMix;
    private String budget;

    public RealmList<RealmString> getLanguages() {
        return languages;
    }

    public void setLanguages(RealmList<RealmString> languages) {
        this.languages = languages;
    }

    public String getAspRetio() {
        return aspRetio;
    }

    public void setAspRetio(String aspRetio) {
        this.aspRetio = aspRetio;
    }

    public RealmList<RealmString> getFilmingLocations() {
        return filmingLocations;
    }

    public void setFilmingLocations(RealmList<RealmString> filmingLocations) {
        this.filmingLocations = filmingLocations;
    }

    public RealmList<RealmString> getAlsoKnownAs() {
        return alsoKnownAs;
    }

    public void setAlsoKnownAs(RealmList<RealmString> alsoKnownAs) {
        this.alsoKnownAs = alsoKnownAs;
    }

    public RealmList<RealmString> getCountries() {
        return countries;
    }

    public void setCountries(RealmList<RealmString> countries) {
        this.countries = countries;
    }

    public String getGross() {
        return gross;
    }

    public void setGross(String gross) {
        this.gross = gross;
    }

    public RealmList<RealmString> getSoundMix() {
        return soundMix;
    }

    public void setSoundMix(RealmList<RealmString> soundMix) {
        this.soundMix = soundMix;
    }

    public String getBudget() {
        return budget;
    }

    public void setBudget(String budget) {
        this.budget = budget;
    }
}
