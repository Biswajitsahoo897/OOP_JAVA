public class sum_division_number {
    public static void main(String[] args) {
        int Number=14,sum=0;
        int original=Number;
        while (Number!=0) {
            int rem=Number%10;
            sum+=rem;
            Number/=10;
        }
        if(original%sum==0){
            System.out.println("Yes ,"+original+" is divisble by "+sum);
        }
        else{
            System.out.println("NO!!");
        }
    }
}
