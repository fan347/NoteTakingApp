package com.example.notetakingapp;

public class Event {
    public String user;
    public String date;
    public String context;
    public String imagePath;

    public Event(String user,String date,String context,String imagePath) {
        this.user = user;
        this.context =context;
        this.date = date;
        this.imagePath = imagePath;
    }

    public Event() {
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}

