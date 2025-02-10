import java.util.Scanner;

public class NewPositionArray {
    public static void main(String[] args) {
        // int arr[]=new int[5];
        int arr[] = { 1, 4, 2, 9, 6, 8, 9, 10, 11, 22, 45, 66 };
        int Find;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The position to find: ");
        Find = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (Find == i) {
                System.out.printf("Match found at index %d ", i);
            }
        }
        for(int i=Find;i<arr.length; i++) {
            
        }
    }
}