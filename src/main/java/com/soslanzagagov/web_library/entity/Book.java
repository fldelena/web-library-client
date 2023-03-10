package com.soslanzagagov.web_library.entity;

public class Book {

    private int id;

    private String name;

    private String author;

    private String category;

    public Book() {
    }

    public Book(String name, String author, String category) {
        this.name = name;
        this.author = author;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
