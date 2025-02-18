// Q2 
// WAP to create a method to create a method named 'multiply' and overload it such that- 
// For 2 inputs, multiply of 2 numbers are done 
// For 3 inputs, multiply of 3 numbers are done 
// For other numbers, multiply them all 
// For multiple parameters (more than 3, pass array to the method) 

// Use cases- 
// (1) 
// (For more than 3 parameters) 
// Enter the number (Press * to stop): 5 
// Enter the number (Press * to stop): 10 
// Enter the number (Press * to stop): 3 
// Enter the number (Press * to stop): 4 
// Enter the number (Press * to stop): * 
// Method for multiple numbers called- (Result)- 600 

// (2) 
// (For 2 parameters) 
// Enter the number (Press * to stop): 5 
// Enter the number (Press * to stop): 10 
// Enter the number (Press * to stop): * 
// Method for Two numbers called- (Result)- 50 

// 7 
// (3) 
// (For 3 parameters) 
// Enter the number (Press * to stop): 5 
// Enter the number (Press * to stop): 10 
// Enter the number (Press * to stop): 50 
// Enter the number (Press * to stop): * 
// Method for Two numbers called- (Result)- 2500 

package Day_6;
import java.util.Scanner;

class Multiply{
    static int multiply(int num1,int num2){
        return num1 * num2;
    }    
    static int multiply(int num1,int num2,int num3){
        return num1 * num2 * num3;
    }
    static int multiply(int arr[],int counter){
        int temp = 1;
        for (int i = 0; i < counter;i++) {
            temp *= arr[i];
        }
        return temp;
    }
}

public class MultiplyNumber extends Multiply {
   public static void main(String[] args) {
       String ch = " "; 
       Scanner sc = new Scanner(System.in);
       int arr[] = new int[10];
       int counter = 0;
       int j=0;
       while (true){
            System.out.print("Enter the number (Press * to stop): ");
            ch = sc.next();
            if (ch.equals("*")){
                break;
            }
    
            arr[j]=ch;            
            j++;
        
        } 
       if (counter == 2) {
       System.out.println(
            Multiply.multiply(arr[0], arr[1]));
       }
       else if (counter == 3) {
            System.out.println(Multiply.multiply(arr[0], arr[1],arr[2]));
       }
       
       else if (counter > 3) {
            System.out.println( Multiply.multiply(arr, counter));
       }
       else{
            System.out.println("insufficient inputs.");
       }
        sc.close();
        return;
   } 
}

