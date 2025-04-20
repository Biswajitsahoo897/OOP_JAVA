// package Experiment_8;
import java.util.Scanner;
public class dPasswordValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password: ");
        String password = sc.nextLine().trim();
        
        try {
            validatePassword(password);
            System.out.println("Password is valid!");
        } catch (Exception e) {
            System.out.println("Invalid Password: " + e.getMessage());
        }
        sc.close();
    }
    public static void validatePassword(String password) throws Exception {
        if (password.length() < 8) {
            throw new Exception("Minimum length must be 8 characters");
        }
        
        password = password.trim();
        if (Character.isLowerCase(password.charAt(0))) {
            password = Character.toUpperCase(password.charAt(0)) + password.substring(1);
        }
        
        if (!password.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?].*")) {
            throw new Exception("Must contain at least one special character");
        }
        if (!password.matches(".*\\d.*")) {
            throw new Exception("Must have at least one numeric character");
        }
    }
}