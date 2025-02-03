import java.util.Scanner;

public class simpleInterest {
    public static void main(String[] args) {
        float principal, interest, time, rate;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the principal,Interest,Time,rate");
        principal = input.nextFloat();
        time = input.nextFloat();
        rate = input.nextFloat();
        interest = (principal * time * rate) / 100;
        System.out.println("Interest is:"+interest);
        System.out.println("Total is:"+(principal+interest));

    }
}
