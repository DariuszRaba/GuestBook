package com.example.demo.Guest;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Guest {

    private String name;
    private String comment;
    private String date;

    public Guest() {
        this.date = getCreationDate();
    }

    public Guest(String name, String comment) {
        this.name = name;
        this.comment = comment;
        this.date = getCreationDate();
    }

    public Guest(String name, String comment, String date) {
        this.name = name;
        this.comment = comment;
        this.date = date;
    }

    private String getCreationDate() {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
        return formatter.format(date);
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public String getComment() {
        return comment;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
