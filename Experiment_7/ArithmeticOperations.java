import java.util.Scanner;
public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean retry = true;
        
        while (retry) {
            try {
                System.out.print("Enter first number: ");
                double a = sc.nextDouble();
                
                System.out.print("Enter second number: ");
                double b = sc.nextDouble();
                
                if (b == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                    System.out.print("Would you like to try again? (yes/no): ");
                    String choice = sc.next();
                    retry = choice.equalsIgnoreCase("yes");
                    continue; 
                }

                double res = a / b;
                System.out.println("Division result: " + res);
                retry = false;
            } catch (Exception e) {
                System.out.println("Error: Invalid input. Please enter a valid number.");
                sc.nextLine(); // clear buffer
            }
        }
        sc.close();
    }
}