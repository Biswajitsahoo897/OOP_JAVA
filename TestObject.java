package Day_11;

// this is the code for the setter and getter methods
public class TestObject {
    public static int a = 20;
    public static int b = 30;
    // we can't use the this keyword in a static context
    // because this keyword is used to refer to the current object
    // and static methods are class methods, not object methods
    public static void getA(int a) {
        TestObject.a = a;
    }

    public static void getB(int b) {
        TestObject.b = b;
    }
    public static void main(String[] args) {
        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);
        getA(40);
        getB(50);
        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);
    }
}
