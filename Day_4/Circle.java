
public class Circle {
    double radius;

    Circle(Double radius) {
        this.radius = radius;
    }

    double Area() {
        return Math.PI * radius * radius;
    }
    double getCircumstances(){
        return 2*Math.PI*radius;
    }
    public static void main(String[] args) {
        Circle rad_1=new Circle(5.21);
        System.out.println("Area :"+rad_1.Area());
        System.out.println("Circumference :"+rad_1.getCircumstances());

    }
}
