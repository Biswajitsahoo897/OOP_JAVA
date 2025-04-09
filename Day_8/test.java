package Day_8;

// public class test {
// public static void main(String[] args) {
//     for (int i = 5; i>=1; i--) {
//         for (int j = 1; j<=i; j++) {
//             System.out.print(j);
//         }
//         System.out.println();
//     }
// }

// }

// public class test {
//     final double pi;  // Declaring a final variable
//     int a=9;//called the instance variable
//     public test() {// Initializing pi in the default constructor
//         pi = 3.14;
//         System.out.println(a);  
//     }

//     public test(double pi) {
//         this.pi = pi;  // Initializing pi using the parameterized constructor
//     }

//     public static void main(String[] args) {
//         test ob = new test();  // Creating an object with parameter 22/7
//         System.out.println(ob.pi);  // Printing the value of pi
//     }
// }

// class test {
//     void m1() {
//         // System.out.println("hi m1-method");
//         m2();
//     }

//    void m2() 
//     { 
//         m1();
//     // System.out.println("hi m2-method"); 
//     }

//     public static void main(String[] args) {
//         test t = new test();
//         t.m1();
//         t.m2();
//     }//this is call the stackOverflow 
// }

class test {
    // test(int i){
    // System.out.println(i);
    // }
    // void good(){
    // System.out.println("it's a method");
    // }
    // public static void main(String[] args) {
    // int i=19;
    // test t=new test(i);
    // t.good();
    // }
    void m1() {
        this.m2();
        System.out.println("m1 method");
    }

    void m2() {
        System.out.println("m2 method");
    }

    public static void main(String[] args) {
        test t = new test();
        t.m1();
    }
}