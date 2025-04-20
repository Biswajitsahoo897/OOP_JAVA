class Shape {
    void about() {
        System.out.println("This is a shape");
    }
}

class Circle extends Shape {
    @Override
    void about() {
        System.out.println("This is a circle");
    }
}

public class Question_5 {
    public static void main(String[] args) {
        Shape S = new Circle();
        S.about();
    }
}
