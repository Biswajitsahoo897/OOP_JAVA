import java.util.Scanner;
class MutiplyNumber {
    public static void main(String[] args) {
        int Mul =1;
        int freq=0;
        boolean flag=true;
        Scanner sc =new Scanner(System.in);
        while (flag) {
            System.out.println("Enter the number (Press * to stop):");
            String input =sc.nextLine();
            if (input.equals("*")) {
                flag=false;                
                break;
            }
            else if (input.matches("\\d+")) {
                int num = Integer.parseInt(input);
                Mul*= num;
                freq++;
                continue;
            }
            else{
                continue;
            }            
        }
        if (freq == 2) {
            System.out.println("Method for Two numbers called- (Result)- : " + Mul);
        } else if (freq > 2) {
            System.out.println("Method for multiple numbers called-(Result)- " + Mul);
        } else {
            System.out.println("Insufficient numbers entered.");
        }
        sc.close();
    }
}
