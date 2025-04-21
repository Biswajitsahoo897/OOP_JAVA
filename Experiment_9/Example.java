package Experiment_9;

import Arithmetic.Arithmetic2;
import Arithmetic.BasicMath;   
public class Example implements Arithmetic2 { 
    public double squareRoot(double x) { 
        return Math.sqrt(x); 
    } 
    public double cube(double x) { 
        return x * x * x; 
    } 
    public static void main(String[] args) { 
        Example ex = new Example(); 
        BasicMath bm = new BasicMath(); 
        int a = 33, b = 94; 
        double x = 45; 
        System.out.println("Add: " + bm.add(a, b)); 
        System.out.println("Subtract: " + bm.subtract(a, b)); 
        System.out.println("Square root of " + x + ": " + ex.squareRoot(x)); 
        System.out.println("Cube of " + x + ": " + ex.cube(x)); 
    } 
}