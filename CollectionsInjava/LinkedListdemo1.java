package Colist1ectionsInjava;

import java.util.LinkedList;

public class LinkedListdemo1 {
    public static void main(String[] args) {
        LinkedList list1=new LinkedList(); 
        System.out.println(list1.size()); 
        //add the elements to the LinkedList 
        list1.add("a"); 
        list1.add(10); 
        list1.add(10.6); 
        list1.addFirst("ratan"); 
        list1.addLast("anu"); 
        System.out.println("original content :"+list1); 
        System.out.println(list1.size()); 
        //remove elements from LinkedList 
        list1.remove(10.6); 
        list1.remove(0); 
        System.out.println("after deletion content  :"+list1); 
        System.out.println(list1.size()); 
        //remove first and last elements 
        list1.removeFirst(); 
        list1.removeLast(); 
        System.out.println("list1 after deletion of first and last :"+list1); 
        //get and set a value 
        int a=(Integer)list1.get(0); 
        list1.set(0,a+"ratan"); 
        System.out.println("list1 after change:"+list1); 
    }
}
