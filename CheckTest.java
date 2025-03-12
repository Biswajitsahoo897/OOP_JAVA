package Day_11;
import java.util.Scanner;
public class CheckTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        Code obj=new Code();
        obj.isEven(n);
        sc.close();
    }
    
}
class Code{
    public void isEven(int n){
        if(n%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }   
    }
}
