package com.example.amoi.imdb.test.model;

import io.realm.RealmList;
import io.realm.RealmObject;

/**
 * Created by amoi on 22/11/2017.
 */

public class Status extends RealmObject {

    private String title;
    private String contentRating;
    private String originalTitle;
    private Metadata metadata;
    private String releaseDate;
    private String director;
    private URL url;
    private String year;
    private RealmList<Trailer> trailer;
    private String length;
    private RealmList<Cast> cast;
    private String imdbId;
    private String rating;
    private RealmList<RealmString> genre;
    private String ratingCount;
    private String storyline;
    private String description;
    private RealmList<RealmString> writers;
    private RealmList<RealmString> stars;
    private Poster poster;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContentRating() {
        return contentRating;
    }

    public void setContentRating(String contentRating) {
        this.contentRating = contentRating;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public URL getUrl() {
        return url;
    }

    public void setUrl(URL url) {
        this.url = url;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public RealmList<Trailer> getTrailer() {
        return trailer;
    }

    public void setTrailer(RealmList<Trailer> trailer) {
        this.trailer = trailer;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public RealmList<Cast> getCast() {
        return cast;
    }

    public void setCast(RealmList<Cast> cast) {
        this.cast = cast;
    }

    public String getImdbId() {
        return imdbId;
    }

    public void setImdbId(String imdbId) {
        this.imdbId = imdbId;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public RealmList<RealmString> getGenre() {
        return genre;
    }

    public void setGenre(RealmList<RealmString> genre) {
        this.genre = genre;
    }

    public String getRatingCount() {
        return ratingCount;
    }

    public void setRatingCount(String ratingCount) {
        this.ratingCount = ratingCount;
    }

    public String getStoryline() {
        return storyline;
    }

    public void setStoryline(String storyline) {
        this.storyline = storyline;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public RealmList<RealmString> getWriters() {
        return writers;
    }

    public void setWriters(RealmList<RealmString> writers) {
        this.writers = writers;
    }

    public RealmList<RealmString> getStars() {
        return stars;
    }

    public void setStars(RealmList<RealmString> stars) {
        this.stars = stars;
    }

    public Poster getPoster() {
        return poster;
    }

    public void setPoster(Poster poster) {
        this.poster = poster;
    }
}
