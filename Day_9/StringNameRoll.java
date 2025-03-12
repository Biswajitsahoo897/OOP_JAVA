// Write a program to take a string as input and print the first 4 characters of the string, then print the first 3 digits of the phone number in ascending order and then print the first even digit of the year and if the first digit is odd then print the next even digit of the year.

package Day_9;
import java.util.Arrays;

public class StringNameRoll {
    static String Name = "Biswajit";
    static String PhoneNo = "8144378982";
    static String Year = "2005";

    void outputPrint(String Name, String PhoneNo, String Year) {
        for (int i = 0; i < 4; i++) {
            System.out.print(Name.charAt(i));
        }
        int[] digits = new int[PhoneNo.length()];
        for (int i = 0; i < PhoneNo.length(); i++) {
            digits[i] = PhoneNo.charAt(i)- '0';
        }

        Arrays.sort(digits);

        for (int i = 0; i < 3; i++) {
            System.out.print(digits[i]);
        }

        for (int i = 0; i < Year.length()-1; i++) {
            if(Year.charAt(i)%2==0){
                System.out.print(Year.charAt(i));
                continue;
            }
            else if(Year.charAt(i)%2==1){
                System.out.print(Year.charAt(i));
            }
        }
    }
    public static void main(String[] args) {
        StringNameRoll obj = new StringNameRoll();
        obj.outputPrint(Name, PhoneNo, Year);
    }
}
