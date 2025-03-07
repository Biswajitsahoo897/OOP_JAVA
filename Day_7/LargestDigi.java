package Day_7;

public class LargestDigi {
    public static void main(String[] args) {
        int largest=0,n=321875;
        while(n!=0){
            int d=n%10;
            if(largest<d){
                largest=d;
            }
            n/=10;
        }

        System.out.println(largest+" is the largest digit");
        
    }
}
