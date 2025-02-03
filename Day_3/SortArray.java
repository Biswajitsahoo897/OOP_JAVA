import java.util.Scanner;
public class SortArray {
    public static void main(String [] args) {
        int arr[]=new int[5];
        for(int i=0;i<arr.length;i++) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            arr[i]=sc.nextInt();
        }
        int temp=arr[0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]>arr[j]) {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        //printing the sorter arry
        for (int i = 0; i < arr.length; i++) {
            System.err.println("Sorted Array: "+arr[i]);
        }
       
    }
}
