import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for user details
        System.out.println("=== Register ===");
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter a username (must contain _ and be no more than 5 characters): ");
        String username = scanner.nextLine();

        System.out.print("Enter a password (min 8 chars, 1 capital, 1 number, 1 special char): ");
        String password = scanner.nextLine();

        System.out.print("Enter your phone number in international format (e.g., +27831234567): ");
        String phoneNumber = scanner.nextLine();

        // Create a new Login object with the user input
        Login login = new Login(firstName, lastName, username, password, phoneNumber);

        // Call the registerUser() method to check inputs and display result
        String registrationMessage = login.registerUser();
        System.out.println("\n" + registrationMessage);

        // Only allow login if registration was successful
        if (registrationMessage.equals("Registration successful!")) {
            System.out.println("\n=== Login ===");
            System.out.print("Enter your username: ");
            String inputUsername = scanner.nextLine();

            System.out.print("Enter your password: ");
            String inputPassword = scanner.nextLine();

            boolean loginSuccess = login.loginUser(inputUsername, inputPassword);
            System.out.println(login.returnLoginStatus(loginSuccess));
        }

        scanner.close();
    }
}
