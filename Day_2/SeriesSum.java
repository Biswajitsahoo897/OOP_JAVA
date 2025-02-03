public class SeriesSum {
    public static void main(String[] args) {
        int numberOfTerms = 10; 
        double sum = 0;
        for (int i = 0; i < numberOfTerms; i++) {
            sum += 1/Math.pow(2, i);
        }
        System.out.println("Sum of the series is:" + sum);
    }
}
