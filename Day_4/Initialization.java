class Initialization {
    int num;
    String text;

    Initialization() {
        num = 10;
        text = "Default";
    }

    Initialization(int num, String text) {
        this.num = num;
        this.text = text;
    }

    Initialization(int num) {
        this.num = num;
        this.text = "Initialized with one parameter";
    }

    void display() {
        System.out.println("Number: " + num + ", Text: " + text);
    }

    public static void main(String[] args) {
        Initialization obj1 = new Initialization();  
        Initialization obj2 = new Initialization(50, "Parameterized");  
        Initialization obj3 = new Initialization(25);  
        obj1.display();
        obj2.display();
        obj3.display();
        
        System.out.println("HashCode of obj1 ="+obj1.hashCode());
        System.out.println("HashCode of obj2 ="+obj2.hashCode());
        System.out.println("HashCode of obj3="+obj3.hashCode());
    }
}
// //  What is hash code?
//  Hash code is a unique identification number allotted to the objects by tlie JVM.- This-hash code
//  number is also called· reference number which is created based on the-location, of the object in
//  mef7}ory, and is uilique for all objects, except for String objects.
//  Howcanyou find the hash r:;ode ofan object?
//  The hashCode() method of 'Object' class inJava./ang package is useful to~find the hash'code ofan
//  object..