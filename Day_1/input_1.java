import java.util.Scanner;
public class input_1 {
    public static void main(String[] args){
        int number,number2,result;
        //for calling a constructor in java is 
        //Classname obj= new classname();
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number: ");
        number=sc.nextInt();
        System.out.println("Enter a number2: ");
        number2=sc.nextInt();
        result=number+number2;
        System.out.println("SUM is "+result);
    }
    
}
