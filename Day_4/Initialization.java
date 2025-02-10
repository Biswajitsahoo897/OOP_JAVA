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
    }
}
