package org.example; //sesuaikan nama package
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class userService {
    private String[][] data = new String[2][3];
    private String email, password, roles = "";

    //ini namanya constructor yang akan dijalankan setiap class diinisialisasikan
    public userService(String emails, String passwords) {
        email = emails;
        password = passwords;
        String[][] data = {
                {"nama1kelompokxx@gmail.com", "12345", "superAdmin"},
                {"nama2kelompokxx@gmail.com", "4567", "user"}
        };
        this.data = data;
    }

    //method bernama checkCredential
    private boolean checkCredential() {
        for (int i = 0; i < data.length; i++) {
            if (data[i][0].equals(email)) {
                if (data[i][1].equals(password)) {
                    roles = data[i][2];
                    return true;
                }
            }
        }
        return false;
    }

    //method bernama login
    public void login() {
        boolean status = checkCredential();
        if (status == true) {
            System.out.println("\nWelcome " + roles);
            System.out.println("Logged it as user email " + email);
        } else {
            System.out.println("Invalid login");
        }
        if (roles.equals("superAdmin")) {
            System.out.println("You have super admin privileges.");
            // Tambahkan logika untuk menambahkan anggota baru di sini
            tambahAnggota();
        }
    }

    public static boolean validasi(String password) {
        return password.matches("[0-9]+");
    }


    private void tambahAnggota() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tambahkan email anggota baru: ");
        String newEmail = scanner.nextLine();
        System.out.print("Buat password: ");
        String newPassword = scanner.nextLine();
        // Validasi password anggota baru
        while (!validasi(newPassword)) {
            System.out.println("Password harus berupa angka semua.");
            System.out.print("Buat password: ");
            newPassword = scanner.nextLine();
            System.out.print("Tambahkan role: ");
            String newRole = scanner.nextLine();

            // Simpan data anggota baru ke dalam array data
            String[][] newData = new String[data.length + 1][3];
            for (int i = 0; i < data.length; i++) {
                newData[i] = data[i];
            }
            newData[data.length] = new String[]{newEmail, newPassword, newRole};
            data = newData;

            System.out.println("Anggota baru berhasil ditambahkan:");
            System.out.println("Email: " + newEmail);
            System.out.println("Password: " + newPassword);
            System.out.println("Role: " + newRole);
        }
    }
}

