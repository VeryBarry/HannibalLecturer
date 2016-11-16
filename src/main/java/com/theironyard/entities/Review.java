package com.theironyard.entities;

import javax.persistence.*;

/**
 * Created by VeryBarry on 10/26/16.
 */
@Entity
@Table(name = "reviews")
public class Review {
    @Id
    @GeneratedValue
    public int id;

    @Column(nullable = false)
    String author;

    @Column(nullable = false)
    String text;

    @Column(nullable = false)
    boolean isGood;

    @ManyToOne
    Lecturer lecturer;

    public Review() {
    }

    public Review(String author, String text, boolean isGood) {
        this.author = author;
        this.text = text;
        this.isGood = isGood;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isGood() {
        return isGood;
    }

    public void setGood(boolean good) {
        isGood = good;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }
}
