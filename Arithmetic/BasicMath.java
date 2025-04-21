package Arithmetic;
public class BasicMath { 
    public int add(int a, int b) { 
        return a + b; 
    } 
    public int subtract(int a, int b) { 
        return a - b; 
    } 
} 

public interface Arithmetic2 { 
    double squareRoot(double x); 
    double cube(double x); 
}