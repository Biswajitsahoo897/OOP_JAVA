package Experiment_03;

import java.util.Scanner;

public class MinimumProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        String numString = sc.nextLine();
        int[] arr = new int[numString.length()];
        for (int i = 0; i < numString.length(); i++) {
            arr[i] = numString.charAt(i) - '0';
        }
        int n = arr.length;
        // applied bubble sorting
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        int minProduct = arr[0] * arr[1];
        System.out.println("Minimum Product: " + minProduct)
        sc.close();
    }
    
}
