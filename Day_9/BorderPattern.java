package Day_9;

public class BorderPattern {
    public static void main(String[] args) {
        for (int i = 9; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                if (i == 1 || j == 8 || i == j) {
                    System.out.print(" * ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}