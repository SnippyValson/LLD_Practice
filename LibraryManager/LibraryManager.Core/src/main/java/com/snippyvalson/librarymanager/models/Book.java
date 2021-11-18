package com.snippyvalson.librarymanager.models;

import com.snippyvalson.librarymanager.enums.BookCategory;

import java.util.ArrayList;

public class Book {
    private int isbn;
    private String name;
    private String author;
    private ArrayList<String> categories;

    public Book()
    {
        categories = new ArrayList<>();
    }

    public ArrayList<String> getBookCategories() {
        return categories;
    }

    public void setBookCategories(ArrayList<String> bookCategory) {
        this.categories = bookCategory;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
}
