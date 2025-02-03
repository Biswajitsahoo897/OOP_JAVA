// import java.util.Scanner;
// public class FindElement {
//     public static void main(String[] args) {
//         int Find,pos=-1;
//         Scanner sc =new Scanner(System.in);
//         System.out.print("Enter the Element to find:\n");
//         Find=sc.nextInt();
//         int arr[]={4,2,9,6,8,10,11};
//         for(int i=0;i<arr.length;i++){
//             if(Find==arr[i]){
//                 System.out.printf("Match found at index %d ",i);
//                 pos=i;
//                 break;
//             }
//         }
//         int arr1[]=new int[arr.length-pos];
//         System.out.println("Array:");
//         for(int i=pos;i<=arr.length;i++){
//             arr1[i]=arr[i];
//             System.out.println(arr1[i]);
//         }
//     }
// }


import java.util.Scanner;
public class FindElement {
    public static void main(String[] args) {
        int Find, pos = -1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Element to find:\n");
        Find = sc.nextInt();
        int arr[] = {10,20,30,40,50,60,70,80,105};
        for (int i = 0; i < arr.length; i++) {
            if (Find == arr[i]) {
                System.out.printf("Match found at index %d\n", i);
                pos = i;
                break;
            }
        }
        if (pos == -1) {
            System.out.println("Element not found");
        } else {
            int arr1[] = new int[arr.length - pos];
            System.out.println("Array:");
            for (int i = pos, j = 0; i < arr.length; i++, j++) {
                arr1[j] = arr[i];
                System.out.println(arr1[j]);
            }
            
        }
    }
}