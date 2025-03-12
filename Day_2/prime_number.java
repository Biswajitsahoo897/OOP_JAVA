import java.util.Scanner;

class prime_number {
    public static void main(String args[]) {
        int lowerLimit, N, counter = 0, upperLimit;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the lowerLimit");
        lowerLimit = input.nextInt();
        System.out.println("Enter the upperLimit");
        upperLimit = input.nextInt();
        if (upperLimit < 0 && lowerLimit < 0) {
            System.out.println("Enter again:");
        }
        System.out.println("Enter the value of the N:");
        N = input.nextInt();
        if (upperLimit > lowerLimit) {
            for (int i = lowerLimit; i < upperLimit; i++) {
                int freq = 0;
                for (int j = 1; j <= 9; j++) {
                    if (i % j == 0) {
                        freq += 1;
                        counter += 1;
                    }
                }

                if (freq < 2) {
                    if (counter == N) {

                        System.out.println(i);
                    }
                }
            }
        } else {
            System.out.println("Not prime number");
        }
    }

}
