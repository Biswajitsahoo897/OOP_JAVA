package Day_10;

public class SumDigit {
    static String PhoneNo = "814437892"; 
    static int sum;
    static boolean flag = true;
    public static void main(String[] args) {

        for (int i = 0; i <= PhoneNo.length() - 1; i++) {
            int y = PhoneNo.charAt(i) - 48;

            if (sum == 0 && y % 2 == 0) { // Ensuring correct behavior for the first even digit
                sum = sum + y;
                continue;
            }

            sum = sum + y;

            if ((sum % 2 == 1 && flag) || (sum % 2 == 0 && !flag)) {
                System.out.print(sum);
                sum = 0;
                flag = !flag;
            }
        }
    }
}

    
