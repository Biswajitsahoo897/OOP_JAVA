package Day_7;
public class FactorialDigit {
    
    public static void main(String[] args) {
        int fact=1,sum=0,n=321875;
        while(n!=0){
            int rem=n%10;
            for(int i=1;i<=rem;i++){
                fact*=i;
            }
            sum+=fact;
            n/=10;
            System.out.println("Factorial of "+rem +" is:"+fact);
            fact=1;
            
        }
        System.out.println("Sum of factorial of digit :"+sum);
    }
}
