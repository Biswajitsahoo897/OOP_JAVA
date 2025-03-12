public class dataType {
    int num;
    char ch;
    String st;
    boolean bool;

    public static void main(String args[]){
        dataType obj =new dataType();
        int a = obj.num; 
        char c = obj.ch; 
        String s = obj.st; 
        boolean b = obj.bool; 
 
        System.out.printf("\nDefault Value\n  Int:%d Size:%d\n  Char:%c\n  String:%s Size:%d\n  Boolean:%b", a, 
Integer.BYTES, c, s, (s == null? 0:s.length()), b); 
 
    }
}
