class Shape {
    void find_Area() {
        System.out.println("Area calculation depends on shape");
    }
}

class Square extends Shape {
    double side;    
    Square(double s) {
        side = s;
    }    
    @Override
    void find_Area() {
        System.out.println("Square area: " + (side * side));
    }
}

class Rectangle extends Shape {
    double length, width;    
    Rectangle(double l, double w) {
        length = l;
        width = w;
    }    
    @Override
    void find_Area() {
        System.out.println("Rectangle area: " + (length * width));
    }
}

public class AreaCalculator {
    public static void main(String[] args) {
        Shape square = new Square(5);
        Shape rectangle = new Rectangle(9, 8);        
        square.find_Area();
        rectangle.find_Area();
    }
}