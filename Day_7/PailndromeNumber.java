package Day_7;

public class PailndromeNumber {
    public static void main(String[] args){
        int num=1221;
        int temp=num;
        int rev=0;  
        while(num>0){
            int rem=num%10;
            rev=rev*10+rem;
            num/=10;
        }
        if(temp==rev){
            System.out.println(rev +" is a pailndrome number");
        }
    }
}
