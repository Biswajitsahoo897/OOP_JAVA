// package Experiment_8;
import java.util.Scanner;

public class CaseConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string (uppercase, lowercase, or sentence): ");
        String s = sc.nextLine();

        if (s.equals(s.toUpperCase())) {
            System.out.println("Lowercase form: " + s.toLowerCase());
        } else if (s.equals(s.toLowerCase())) {
            System.out.println("Uppercase form: " + s.toUpperCase());
        } else {
            System.out.println("Sentence without spaces: " + s.replace(" ", ""));
        }
    }
}

