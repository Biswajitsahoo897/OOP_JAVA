public class abc_pattern {
    public static void main(String[] args) {
        for (int i = 5; i >0; i--){//for row 
            for (int j = 0; j <i ; j++){//for col 
                System.out.printf("%c ",+(65+j));
            }
            System.out.println("");
        }
    }
}
