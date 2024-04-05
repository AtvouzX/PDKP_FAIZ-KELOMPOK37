package com.company; //sesuaikan nama package

public class userService {
    private String[][] data = new String[2][3];
    private String email, password, roles = "";

    //ini namanya constructor yang akan dijalankan setiap class diinisialisasikan
    public userService(String emails, String passwords) {
        email = emails;
        password = passwords;
        String[][] data = {
                {"nama1@kelompokXX.com", "12345", "superAdmin"},
                {"nama2@kelompokXX.com", "4567", "user"}
        };
        this.data = data;
    }

    //method bernama checkCredential
    public boolean checkCredential() {
        for(int i = 0; i < data.length; i++ ) {
            if(data[i][0].equals(email)) {
                if(data[i][1].equals(password)) {
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
        if(status == true) {
            System.out.println("\nWelcome " + roles);
            System.out.println("Logged it as user email " + email);
        } else {
            System.out.println("\nInvalid Login ");
        }
    }
}
