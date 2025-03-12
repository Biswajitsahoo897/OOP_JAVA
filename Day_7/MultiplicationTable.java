package Day_7;
import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        int num;
        Scanner sc =new Scanner(System.in);
        while (true) {
            System.out.println("Enter the num:");
            num=sc.nextInt();
            for(int i=1;i<=10;i++){
                System.out.println(num+" X "+i+" = "+(num*i));
            }
            System.out.println("Do u want to continue/(y/n)");
            char ch=sc.next().charAt(0);
            if(ch=='n')
            break;

        }
        sc.close();
    }
}
