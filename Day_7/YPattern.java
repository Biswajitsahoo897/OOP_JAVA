package Day_7;

public class YPattern {
    public static void main(String[] args) {
        for (int i=1;i<=7;i++) {
            for (int j = 1; j <=7; j++) {
                if(j == 4 || i == 4 || (i == 0 && j >= 4) || (i == 9 && j <= 4) ||
                (j == 0 && i <= 4) || (j == 9 && i >= 4)){
                    System.out.print("+");
                }
                else{
    
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
