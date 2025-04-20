// package Experiment_8;
import java.util.Scanner;

public class StringConcatenation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String str1 = sc.nextLine().trim();
        System.out.println("Enter second string: ");
        String str2 = sc.nextLine().trim();

        if (str1.charAt(str1.length() - 1) == str2.charAt(0)) {
            System.out.println("Concatenated String: " + str1 + str2.substring(1));
        } else {
            System.out.println("Concatenated String: " + str1 + str2);
        }
    }
}

