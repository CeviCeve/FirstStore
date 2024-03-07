package com.app.firststore.Model;

public class Course {

    int id, color;
    String title;
    String data;
    String level;
    String sale;


    String text;

    public Course(int id, String sale, String title, String data, String level, int color, String text) {
        this.id = id;
        this.sale = sale;
        this.title = title;
        this.data = data;
        this.level = level;
        this.color = color;
        this.text = text;
    }
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSale() {
        return sale;
    }

    public void setSale(String sale) {
        this.sale = sale;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}
