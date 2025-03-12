public class sumEvenOdd {
    public static void main(String[] args) {
        int number = 2345;   
        int even_sum=0,odd_sum=0;    
        while (number != 0) {
            int rem =number%10;
            if(rem%2==0){
                even_sum+=rem;
            }
            else{
                odd_sum+=rem;
            }
            number/=10;
        }   
        
        System.out.println("The sum of even number is:"+even_sum);
        System.out.println("The sum of odd number is:"+odd_sum);
    }
}
