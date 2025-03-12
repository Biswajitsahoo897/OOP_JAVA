import java.util.Scanner;
public class TwoEqualArray {
    public static void main(String[] args) {
       int arr1[] = {1,2,5,6,8,9};
       int arr2[] = {1,2,5,6,9};
        boolean equal = true;
        for(int i=0;i<arr1.length;i++) {
            if(arr1[i]!=arr2[i]) {
                equal = false;
                break;
            }
        }
        if(equal){
            System.out.println("Both arrays are equal");
        } else {
            System.out.println("Both arrays are not equal");
        }
    }
}
