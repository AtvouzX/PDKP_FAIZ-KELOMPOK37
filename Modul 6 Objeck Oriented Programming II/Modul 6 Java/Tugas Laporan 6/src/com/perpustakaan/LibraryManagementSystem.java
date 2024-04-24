package com.perpustakaan;

import java.util.Scanner;
import com.perpustakaan.FictionBook;
import com.perpustakaan.NonFictionBook;
import com.perpustakaan.Library;

public class LibraryManagementSystem {
    private static Scanner scanner = new Scanner(System.in);
    private static Library library = new Library();

    public static void main(String[] args) {
        initializeLibrary();
        mainMenu();
    }

    private static void initializeLibrary() {
        // Inisialisasi perpustakaan dengan buku-buku awal
        library.addBook(new FictionBook("Buku 1", "Penulis A", 200));
        library.addBook(new NonFictionBook("Buku 2", "Penulis B", 300));
        library.addBook(new FictionBook("Buku 3", "Penulis C", 150));
    }

    private static void mainMenu() {
        boolean exit = false;
        while (!exit) {
            System.out.println("\nMenu Utama:");
            System.out.println("1. Daftar Buku");
            System.out.println("2. Tambah Buku");
            System.out.println("3. Pinjam Buku");
            System.out.println("4. Kembalikan Buku");
            System.out.println("5. Catatan Peminjaman");
            System.out.println("6. Keluar");
            System.out.print("Pilihan: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Membersihkan baris input

            switch (choice) {
                case 1:
                    library.displayBooks();
                    break;
                case 2:
                    addBook();
                    break;
                case 3:
                    borrowBook();
                    break;
                case 4:
                    returnBook();
                    break;
                case 5:
                    library.displayLoanRecords();
                    break;
                case 6:
                    exit = true;
                    System.out.println("Terima kasih telah menggunakan program ini.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }

    private static void addBook() {
        System.out.print("Masukkan judul buku: ");
        String title = scanner.nextLine();

        System.out.print("Masukkan nama penulis: ");
        String author = scanner.nextLine();

        System.out.print("Masukkan jumlah halaman: ");
        int pages = scanner.nextInt();
        scanner.nextLine(); // Membersihkan baris input

        System.out.print("Jenis buku (1. Fiction, 2. Non-Fiction): ");
        int bookType = scanner.nextInt();
        scanner.nextLine(); // Membersihkan baris input

        Book newBook;
        if (bookType == 1) {
            newBook = new FictionBook(title, author, pages);
        } else {
            newBook = new NonFictionBook(title, author, pages);
        }

        library.addBook(newBook);
        System.out.println("Buku berhasil ditambahkan!");
    }

    private static void borrowBook() {
        System.out.print("Masukkan judul buku yang ingin dipinjam: ");
        String title = scanner.nextLine();

        Book bookToBorrow = null;
        for (Book book : library.getBooks()) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                bookToBorrow = book;
                break;
            }
        }

        if (bookToBorrow == null) {
            System.out.println("Buku tidak ditemukan di perpustakaan.");
        } else {
            System.out.print("Masukkan nama peminjam: ");
            String borrowerName = scanner.nextLine();
            library.borrowBook(bookToBorrow, borrowerName);
        }
    }

    private static void returnBook() {
        System.out.print("Masukkan judul buku yang ingin dikembalikan: ");
        String title = scanner.nextLine();

        Book bookToReturn = null;
        for (Book book : library.getBooks()) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                bookToReturn = book;
                break;
            }
        }

        if (bookToReturn == null) {
            System.out.println("Buku tidak ditemukan di perpustakaan.");
        } else {
            System.out.print("Masukkan nama peminjam: ");
            String borrowerName = scanner.nextLine();
            library.returnBook(bookToReturn, borrowerName);
        }
    }
}