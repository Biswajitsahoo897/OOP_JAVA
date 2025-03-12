package Day_10;

public class NumberSum {
    static String PhoneNo="81443789";
    static int sum;
    static boolean flag=true;
    public static void main(String[] args) {
        for (int i = 0; i <=PhoneNo.length()-1; i++) {
            int y=PhoneNo.charAt(i)-48;
            if(y%2==0){
                sum=sum+y;
                continue;
            }

            if(y%2==1){
                sum=sum+y;
                System.out.print(sum);
                sum=0;
                continue;
            }
            
            else if (flag) {
                sum=sum+y;               
                if(sum%2==1){
                    flag=false;
                    System.out.print(sum);
                    sum=0;
                    continue;
                }
            }
            else{
                sum=sum+y;
            }

        }
        // System.out.println(sum);
    }
}
