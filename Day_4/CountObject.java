public class CountObject {
    static int count = 0;
    CountObject() {
        count++;
    }
        public static void main(String[] args) {
            CountObject obj_1=new CountObject();
            CountObject obj_2=new CountObject();
            CountObject obj_3=new CountObject();
            System.out.println("Number of objects created: " + count);
        
    }
}
