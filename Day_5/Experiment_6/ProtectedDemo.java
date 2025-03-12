package Day_5.Experiment_6;
// base class
class Parent {
    protected String message = "Hello from Parent";

    protected void displayMessage() {
        System.out.println(message);
    }
}
//same package
class Child extends Parent {
    public void show() {
        displayMessage(); // Accessing protected method
        System.out.println("Accessing protected variable: " + message);
    }
}
public class ProtectedDemo {
    public static void main(String[] args) {
        Child child = new Child();
        child.show();
    }
}
