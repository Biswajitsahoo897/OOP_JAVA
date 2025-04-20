// package Experiment_7;
import java.util.Scanner;
public class ArrayIndexHandeling {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        Scanner sc =new Scanner(System.in);
        try {
            System.out.println("Enter an index(0-4):");
            int in=sc.nextInt();
            System.out.println("Value at index " + in + ": " + arr[in]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds: " + e.getMessage());
        } 
        finally {
            System.out.println("Execution completed...");
        }
        sc.close();

    }
}
