import java.util.Scanner;
public class InsufficientFund {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your account balance: ");
        double balance = sc.nextDouble();
        System.out.print("Enter the amount to withdraw: ");
        double withAmt = sc.nextDouble();

        try {
            if (withAmt > balance) {
                throw new InsufficientFundsException("Insufficient funds for withdrawal.");
            } else {
                balance -= withAmt;
                System.out.println("Withdrawal successful! New balance: " + balance);
            }
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}