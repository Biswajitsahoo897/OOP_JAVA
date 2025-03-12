package Day_11;

public class instanceMethod {
    public static void main(String[] args) {
        Multiply.nums(7,8);
    }
}
class Multiply{
    public static void nums(int a, int b){
        System.out.println(a+" X "+b+" = "+(a*b));
    }
}
// invoke the static methid by passing required inputs
// output: 7 X 8 = 56