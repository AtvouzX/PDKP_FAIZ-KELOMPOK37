package com.perpustakaan;

import java.time.LocalDate;

class LoanRecord {
    private Book book;
    private String borrowerName;
    private LocalDate loanDate;

    public LoanRecord(Book book, String borrowerName, LocalDate loanDate) {
        this.book = book;
        this.borrowerName = borrowerName;
        this.loanDate = loanDate;
    }

    public Book getBook() {
        return book;
    }

    public String getBorrowerName() {
        return borrowerName;
    }

    public LocalDate getLoanDate() {
        return loanDate;
    }
}
