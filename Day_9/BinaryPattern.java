package Day_9;

public class BinaryPattern {
    public static void main(String[] args) {
        int k=1;
        for (int i = 5; i >=1; i--) {
            for (int j =1;j <= i; j++) {
                System.out.print(i%2);
                // k++;
            }
            System.out.println();
        }
    }
}
