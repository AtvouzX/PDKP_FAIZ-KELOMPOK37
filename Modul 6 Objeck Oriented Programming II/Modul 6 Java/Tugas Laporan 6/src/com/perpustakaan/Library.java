package com.perpustakaan;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class Library {
    private List<Book> books;
    private List<LoanRecord> loanRecords;

    public Library() {
        this.books = new ArrayList<>();
        this.loanRecords = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getBooks() {
        return books;
    }

    public void borrowBook(Book book, String borrowerName) {
        LoanRecord record = new LoanRecord(book, borrowerName, LocalDate.now());
        loanRecords.add(record);
        System.out.println("Buku '" + book.getTitle() + "' berhasil dipinjam oleh " + borrowerName);
    }

    public void returnBook(Book book, String borrowerName) {
        for (LoanRecord record : loanRecords) {
            if (record.getBook().equals(book) && record.getBorrowerName().equals(borrowerName)) {
                loanRecords.remove(record);
                System.out.println(borrowerName + " Telah mengembalikkan " + book.getTitle() + " Milik " + book.getAuthor());
                return;
            }
        }
        System.out.println("Tidak ada catatan peminjaman untuk buku ini");
    }

    public void displayBooks() {
        System.out.println("Daftar Buku di Perpustakaan:");
        for (Book book : books) {
            System.out.println("Judul: " + book.getTitle() + ", Penulis: " + book.getAuthor() +
                    ", Jumlah Halaman: " + book.getPages() + ", Jenis: " + book.getBookType());
        }
    }

    public void displayLoanRecords() {
        System.out.println("Catatan Peminjaman Buku:");
        for (LoanRecord record : loanRecords) {
            System.out.println("Buku: " + record.getBook().getTitle() + ", Peminjam: " + record.getBorrowerName() +
                    ", Tanggal Peminjaman: " + record.getLoanDate());
        }
    }
}
