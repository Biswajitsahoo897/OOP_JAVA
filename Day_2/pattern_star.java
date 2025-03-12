public class pattern_star {
    public static void main(String[] args) {
        int freq=0;
        System.out.println("printing the stars");
        for (int i =1; i <=8; i++) {
            if(i%2==0){
                for(int j=1; j<=i-1; j++){
                    System.out.print("* ");
                }
                System.out.print("\n");               
            }
            else{
                System.out.println("* ");               
        }
        }
    }
}
