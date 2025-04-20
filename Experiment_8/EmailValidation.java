import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your email ID: ");
        String email = sc.nextLine().trim();

        if (isValidEmail(email)) {
            System.out.println("Correct Email");
        } else {
            System.out.println("Incorrect Email");
        }
        sc.close();
    }

    public static boolean isValidEmail(String email) {
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}

