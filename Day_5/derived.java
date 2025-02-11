package Day_5;

public class derived extends base{
    derived(int x){
        // System.out.println(x);
        super(10);
        System.out.println("Inside the derived class constructor");
        System.out.println(x);
    }
    public static void main(String[] args) {
        derived b =new derived(11);

    }
}
