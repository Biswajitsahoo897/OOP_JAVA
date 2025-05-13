package CollectionsInjava;
import java.util.*; 
public class ArrayListDemo1 {
    public static void main(String[] args) {
        // Create an ArrayList and this is the RAW ArrayList    
        // ArrayList list = new ArrayList();
        // System.out.println("ArrayList size:(BEFORE) " + list.size());
        // // Adding  elements 
        // list.add("Apple");
        // list.add("Banana");
        // list.add("Cherry");
        // list.add(null);
        // list.add(20);
        // list.add(4,"Nishant");

        // System.out.println("ArrayList size:(AFTER) " + list.size());
        // System.out.println("ArrayList elements: " + list);



        
        // GENERIC ARRAYLIST
        // Always use generics like ArrayList<Integer> to make your code type-safe, easier to read, and less error-prone.
        ArrayList<Integer> al=new ArrayList<Integer>(); 
        al.add(10); 
        al.add(20); 
        al.add(30); 
        al.add(40); 
        System.out.println(al); 
        Integer[] a=new Integer[al.size()]; 
        al.toArray(a); 
        int sum=0; 
        for (Integer a1:a) 
        { 
            sum=sum+a1; 
            System.out.println(a1); 
        } 
        System.out.println(sum);

    }
}