package Day_7;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int num;
        Scanner sc =new Scanner(System.in);
        while (true) {
            System.out.println("Enter the Number: ");
            num=sc.nextInt();
            boolean isPrime=true;
            if(num<=1){
                isPrime=false;
            }
            else{
                for(int i=2;i<num;i++){
                    if(num%i==0){
                        isPrime=false;
                        break;
                    }
                }
            }
            if(isPrime){
                System.out.println(num+" is a prime number.");
            }
            else{
                System.out.println(num+" is not a prime number.");
            }
            System.out.println("Do you want to continue?(y/n)");
            char ch=sc.next().charAt(0);
            if(ch=='n')
            break;
        }
        sc.close();
    }
}
