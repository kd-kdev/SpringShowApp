package com.kd.ShowApp.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "netflix")
public class Show {
    @Id
    @Column(name = "show_id", unique = true)
    private String show_id;
    private String type;
    private String title;
    private String director;
    private String castMembers;
    private String country;
    private String date_added;
    private int release_year;
    private String rating;
    private String duration;
    private String listed_in;
    private String description;

    public Show() {
    }

    public Show(String show_id, String type, String title, String director, String castMembers, String country, String date_added, int release_year, String rating, String duration, String listed_in, String description) {
        this.show_id = show_id;
        this.type = type;
        this.title = title;
        this.director = director;
        this.castMembers = castMembers;
        this.country = country;
        this.date_added = date_added;
        this.release_year = release_year;
        this.rating = rating;
        this.duration = duration;
        this.listed_in = listed_in;
        this.description = description;
    }

    public String getShow_id() {
        return show_id;
    }

    public void setShow_id(String show_id) {
        this.show_id = show_id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getCastMembers() {
        return castMembers;
    }

    public void setCastMembers(String castMembers) {
        this.castMembers = castMembers;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDate_added() {
        return date_added;
    }

    public void setDate_added(String date_added) {
        this.date_added = date_added;
    }

    public int getRelease_year() {
        return release_year;
    }

    public void setRelease_year(int release_year) {
        this.release_year = release_year;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getListed_in() {
        return listed_in;
    }

    public void setListed_in(String listed_in) {
        this.listed_in = listed_in;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
