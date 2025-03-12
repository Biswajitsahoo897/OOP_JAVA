package Day_9;

public class MiddleElementSum {
    public static void main(String[] args) {
        int [] arr={3,4,5,19,1,5,2,7};
        int n=arr.length;
        int m1=arr[n/2];
        int m2=arr[n/2-1];
        System.out.println(m1+m2);
    }
}
