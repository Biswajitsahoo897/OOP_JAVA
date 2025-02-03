
import java.util.Scanner;
public class ResultDisplay {
    public static void main(String[] args) {
        int Sum=0;
        int arr[]={56,89,70,90,75};
        for (int index=0;index<arr.length;index++) {
            Sum+=arr[index];
        }
       if(Sum<=500 && Sum>=400){
            System.out.println("Grade Optained = O");
        }
        else if(Sum<400 && Sum>=300){
            System.out.println("Grade Optained = E");
        }
        else if(Sum<300 && Sum>=250){
            System.out.println("Grade Optained = A");
        }
        else if(Sum<250 && Sum>=200){
            System.out.println("Grade Optained = B");
        }
        else if(Sum<=199 && Sum>=0){
            System.out.println("Grade Optained = F");
        }
        else{
            System.out.println("Invalid Input");
        }
    }
}
