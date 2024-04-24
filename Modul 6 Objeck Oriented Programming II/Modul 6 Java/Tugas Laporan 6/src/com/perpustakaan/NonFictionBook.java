package com.perpustakaan;

// Inheritance and Polymorphism
public class NonFictionBook extends Book {
    public NonFictionBook(String title, String author, int pages) {
        super(title, author, pages);
    }

    @Override
    public String getBookType() {
        return "Non-Fiction";
    }
}
