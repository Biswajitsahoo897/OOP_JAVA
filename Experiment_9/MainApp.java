package Experiment_9;
import java.util.Scanner;  
import mathutils.MathOperations;

public class MainApp { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter a number: "); 
        double number = scanner.nextDouble(); 
        System.out.println("Square root: " + MathOperations.squareRoot(number)); 
        System.out.println("Square: " + MathOperations.square(number)); 
        System.out.println("Cube: " + MathOperations.cube(number)); 
        scanner.close(); 
    } 
}