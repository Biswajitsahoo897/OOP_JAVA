// // public class test_1(){
// //     int x=10;
// //     static int y=20;
// //     void show(){
// //         System.out.println(x);
// //         System.out.println(y);
// //     }
// //     static void show1(){
// //         System.out.println(x);
// //         System.out.println(y);
// //     }
// //     public static void main(String[] args) {
// //         System.out.println(x);
// //         System.out.println(y);
// //         show();
// //         show1();
// //         show2();
// //         show3();

// //     }
// // }
// // class test_2(){
// //     void show2(){
// //         System.out.println("HELLO");
// //     }
// //     static void show3(){
// //         System.out.println("Bye");
// //     }
// // }

// package Day_3;

// public class Extest_1 {
//     int x = 10; // Instance variable
//     static int y = 20; // Static variable

//     // Non-static method
//     void show() {
//         System.out.println(x); // Accessing instance variable
//         System.out.println(y); // Accessing static variable
//     }

//     // Static method
//     static void show1() {
//         // System.out.println(x); // This would cause an error
//         System.out.println(y); // Accessing static variable
//     }

//     public static void main(String[] args) {
//         // Creating an instance of test_1 to access non-static members
//         Extest_1 obj = new Extest_1();
//         System.out.println(obj.x); // Access instance variable through object
//         System.out.println(y);     // Access static variable directly

//         obj.show(); // Call non-static method through object
//         show1();    // Call static method directly

//         // Creating an instance of test_2 to access its non-static methods
//         test_2 obj2 = new test_2();
//         obj2.show2(); // Call non-static method through object

//         // Call static method of test_2 directly
//         test_2.show3();
//     }
// }

// class test_2 {
//     // Non-static method
//     void show2() {
//         System.out.println("HELLO");
//     }

//     // Static method
//     static void show3() {
//         System.out.println("Bye");
//     }
// }

