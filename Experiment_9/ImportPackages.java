package Experiment_9;
import java.util.Scanner; 
import java.util.*; 

public class ImportPackages {
    public static void main(String[] args) { 
        java.util.Scanner scanner = new java.util.Scanner(System.in); 
        System.out.print("Enter a number: "); 
        int n = scanner.nextInt(); 
        System.out.println("You entered: " + n); 
        scanner.close(); 
    } 
}
