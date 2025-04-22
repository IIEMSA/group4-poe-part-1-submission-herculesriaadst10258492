// This class handles registration and login logic for a user
public class Login {

    // These are variables that store the user's details
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private String phoneNumber;

    // This is the constructor - it sets the user details when an object is created
    public Login(String firstName, String lastName, String userName, String password, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }

    // BOOLEAN METHOD 1
    // Checks if the username contains an underscore and is no more than 5 characters
    public boolean checkUserName() {
        return userName.contains("_") && userName.length() <= 5;
    }

    // BOOLEAN METHOD 2
    // Checks if the password is strong:
    // - At least 8 characters, has a capital letter, number, and special character
    public boolean checkPasswordComplexity() {
        return password.matches("^(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*()_+=<>?{}\\[\\]-]).{8,}$");
    }

    // BOOLEAN METHOD 3
    // Checks if the phone number starts with +27 and has exactly 9 more digits
    public boolean checkCellPhoneNumber() {
        return phoneNumber.matches("^\\+27\\d{9}$");
    }

    // STRING METHOD 1
    // This handles the full registration logic and returns a message
    public String registerUser() {
        if (!checkUserName()) {
            return "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than five characters in length.";
        }
        if (!checkPasswordComplexity()) {
            return "Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.";
        }
        if (!checkCellPhoneNumber()) {
            return "Cell phone number is incorrectly formatted or does not contain international code.";
        }
        return "Registration successful!";
    }

    // BOOLEAN METHOD 4
    // This checks if the login credentials match the registered user
    public boolean loginUser(String username, String passwordInput) {
        return this.userName.equals(username) && this.password.equals(passwordInput);
    }

    // STRING METHOD 2
    // This returns a friendly login message or error message
    public String returnLoginStatus(boolean isLoggedIn) {
        if (isLoggedIn) {
            return "Welcome " + this.firstName + ", " + this.lastName + " it is great to see you again.";
        } else {
            return "Username or password incorrect, please try again.";
        }
    }
}
