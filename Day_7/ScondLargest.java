package Day_7;

public class ScondLargest {
    public static void main(String[] args) {
        int first=0,second=0,n=321875;
        while(n!=0){
            int digit=n%10;
            n/=10;
            if(digit>first){
                second=first;
                first=digit;

            }
            else if(digit>second && digit<first){
                second=digit;

            }
        }
        System.out.println("First largest digit :"+first);
        System.out.println("Second largest digit :"+second);
    }
}
