package Experiment_03;

public class ZerosArray {
    public static void main(String[] args) {
        String numString = "110247745080 ";
        char[] arr = numString.toCharArray();
        int index = 0;

        System.out.println("Printing the array");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != '0') {
                arr[index] = arr[i]; // for moving the non-zero Numbers
                index++;
            }
        }
        while (index < arr.length) {
            arr[index] = '0';
            index++;
        }
        System.out.println("Output: " + new String(arr));

    }
}
