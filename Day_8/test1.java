package Day_8;
public class test1
 {
    String name;
    int id;

    // mutator method we are able to access and the data
    void setName(String name) {
        this.name = name;
    }

    void setId(int id) {
        this.id = id;
    }

    // accessor methods are used to read the data
    String getName() {
        return name;
    }

    int getId() {
        return id;
    }

    public static void main(String[] args)  
    { 
        test1 t=new test1(); 
        t.setName("ratan"); 
        t.setId(12345); 
        String name=t.getName(); 
        System.out.println(name); 
        int id=t.getId(); 
        System.out.println(id); 
    }
}