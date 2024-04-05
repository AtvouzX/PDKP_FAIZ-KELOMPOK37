import java.util.Scanner;
import com.company.userService;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    while (true) {
        System.out.println("\nWelcome to the Application!");
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.println("3. Exit");

        int choice = input.nextInt();

        switch (choice) {
            case 1:
                login();
                break;
            case 2:
                register();
                break;
            case 3:
                System.out.println("Goodbye!");
                System.exit(0);
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

        String email, password;


        System.out.print("Email : ");
        email = input.nextLine();
        System.out.print("Password : ");
        password = input.nextLine();

        userService satu = new userService(email, password);
        satu.login();

        }

    }
}