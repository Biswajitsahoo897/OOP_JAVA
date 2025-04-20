// package Experiment_8;
import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first lowercase string: ");
        String a = sc.nextLine().trim();
        System.out.println("Enter second lowercase string: ");
        String b = sc.nextLine().trim();

        if (areAnagrams(a, b)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public static boolean areAnagrams(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        char[] arr1 = a.toCharArray();
        char[] arr2 = b.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }
}
