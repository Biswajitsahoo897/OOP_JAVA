package Day_7;

public class AmstrongNumber {
    public static void main(String[] args) {
        int num=153,original=num,count=0,sum=0,mul=1;
        while (num!=0) {
            num/=10;
            count++;
        }
        System.out.println("printing the value of count "+count);
        num=original;
        while (num>0) {
            int rem=num%10;
            mul=1;
            for(int i=1;i<=count;i++){
                mul*=rem;
            }            
            sum+=mul;
            num/=10;
        }
        if(original==sum){
            System.out.println(original+" is an amstrong Number");
        }
        else{
            System.out.println(original+" is not an amstrong Number");
        }

        
    }
}
