import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a password: ");
        // Read the password input
        String userPassword = scanner.nextLine();

        // Check password validity
        if (isValidPassword(userPassword)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
    }

    // Checking password validity
    public static boolean isValidPassword(String password) {
        // Password has to be at least eight characters
        if (password.length() < 8) {
            return false;
        }

        int charCount = 0;
        int numCount = 0;

        // Check each character in the password
        for (int i = 0; i < password.length(); i++) {
            // If the character is a letter or digit
            if (Character.isLetterOrDigit(password.charAt(i))) {
                // If it's a digit, increment numCount
                if (Character.isDigit(password.charAt(i))) {
                    numCount++;
                } else {
                    // If it's a letter then charCount increments
                    charCount++;
                }
            } else {
                return false;
            }
        }

        // Checking for at least two digits
        if (numCount < 2) {
            return false;
        }
        return true;
    }
}