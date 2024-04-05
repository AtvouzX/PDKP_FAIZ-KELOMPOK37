package org.example; //sesuaikan nama package
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

import static org.example.userService.validasi;


public class Main {
    public static void main(String[] args) {
        // write your code here
        String email, password;

        Scanner input = new Scanner(System.in);
        System.out.print("Email : ");
        email = input.nextLine();
        System.out.print("Password : ");
        password = input.nextLine();
        userService satu = new userService(email, password);
        boolean isValid = validasi(password);
        if (isValid) {
            // Lakukan operasi login jika password valid
            satu.login();
        } else {
            while (!validasi(password)) {
                System.out.println("Password harus berupa angka semua.");
                System.out.print("Password: ");
                password = input.nextLine();
            }
            satu.login();
        }
    }
}
