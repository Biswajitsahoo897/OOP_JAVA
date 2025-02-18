// Q3 
// Shape is the super class for square and rectangle. Write a program to find areas of square 
// and rectangle by inheriting shape.  
// Method-find_Area() should be declared in shape. Parameters could be changed as per 
// needed.  

package Day_6;
class Shape {
    int getArea() {
        return 0;
    }
}
class Square extends Shape {
    int side;
    Square(int side) {
        this.side = side;
    }
    int getArea() {
        return side * side;
    }
}

class Rectangle extends Shape {
    int lenght;
    int breadth;
    Rectangle(int length, int breadth) {
        this.lenght = length;
        this.breadth = breadth;
    }
    int getArea() {
        return lenght * breadth;
    }
}

public class FindArea {
    public static void main(String[] args) {
        Square square = new Square(7);
        System.out.println("Area of the square: " + square.getArea());
        Rectangle rectangle = new Rectangle(7, 9);
        System.out.println("Area of rectangle: " + rectangle.getArea());
    }
}
