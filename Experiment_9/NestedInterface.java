package Experiment_9;
class OuterClass { 
    interface NestedInterface { 
        void display(); 
    } 
    class InnerClass implements NestedInterface { 
        @Override 
        public void display() { 
            System.out.println("Hello from Nested Interface!"); 
        } 
    } 
}
public class NestedInterface {
    public static void main(String[] args) { 
        OuterClass outer = new OuterClass(); 
        OuterClass.InnerClass inner = outer.new InnerClass(); 
        inner.display(); 
    }
}
