package Day_11;

public class MainObject {
    private int a=45;
    private int b=50;
    public void setA_B(int a ,int b){
        this.a=a;
        this.b=b;
    }
    public void getA_B(){
        System.out.println("Value of a: "+this.a);
        System.out.println("Value of b: "+this.b);
    }
    public static void main(String[] args) {
        MainObject obj=new MainObject();
        obj.getA_B();
    }
}
