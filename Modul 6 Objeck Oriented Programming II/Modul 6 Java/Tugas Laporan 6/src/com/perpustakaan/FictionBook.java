package com.perpustakaan;

// Inheritance and Polymorphism
public class FictionBook extends Book {
    public FictionBook(String title, String author, int pages) {
        super(title, author, pages);
    }

    @Override
    public String getBookType() {
        return "Fiction";
    }
}