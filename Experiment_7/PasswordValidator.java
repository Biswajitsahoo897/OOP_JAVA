import java.util.Scanner;
class PasswordValidationException extends Exception {
    public PasswordValidationException(String message) {
        super(message);
    }
}

public class PasswordValidator{  

    public static void validatePassword(String password) throws PasswordValidationException {
        if (password.length() < 8) {
            throw new PasswordValidationException("Password must be at least 8 characters long.");
        } else if (!password.matches(".*[A-Za-z].*")) {
            throw new PasswordValidationException("Password must contain at least one letter.");
        } else if (!password.matches(".*\\d.*")) {
            throw new PasswordValidationException("Password must contain at least one number.");
        } else if (!password.matches(".*[@#$%^&+=!].*")) {
            throw new PasswordValidationException("Password must contain at least one special character (@#$%^&+=!).");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String userPassword = sc.nextLine();
        try {
            validatePassword(userPassword);
            System.out.println("Password is valid!");
        } catch (PasswordValidationException e) {
            System.out.println("Invalid Password: " + e.getMessage());
        }
        
        sc.close();
    }
}
