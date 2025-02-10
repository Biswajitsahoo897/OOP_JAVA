class pen {
    String color;
    String type;//ballpoint or gel;
    public void write(){
        System.out.println("writting Something");
    }    

    public void printColor(){
        System.out.println(color);
    }
}

public class OOPS{
    public static void main(String args[]){
        pen pen_1 = new pen();
        pen_1.color="Green";
        pen_1.type="Ballpoint";

        pen pen_2= new pen();
        pen_2.color="Black";
        pen_2.type ="Gel";

        pen_1.printColor();
        pen_2.printColor();
    }
}