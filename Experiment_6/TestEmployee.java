class Employee {
    String name;
    int id;
    String department;

    // c1(no parameter)
    Employee() {
        System.out.println("Default Constructor Called");
        name = "Not Assigned";
        id = 0;
        department = "Not Assigned";
    }

    // c2 with one parameter
    Employee(String empName) {
        name = empName;
        id = 0;
        department = "Not Assigned";
    }

    // c3 with two parameters
    Employee(String empName, int empId) {
        name = empName;
        id = empId;
        department = "Not Assigned";
    }

    // c4 with three parameters
    Employee(String empName, int empId, String dept) {
        name = empName;
        id = empId;
        department = dept;
    }
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Department: " + department);
        System.out.println("---------------------------");
    }
}

public class TestEmployee {
    public static void main(String[] args) {
        Employee emp1 = new Employee();                         
        Employee emp2 = new Employee("Binaya");                  
        Employee emp3 = new Employee("Bikash", 101);           
        Employee emp4 = new Employee("Biswajit", 102, "HR");    

        emp1.displayDetails();
        emp2.displayDetails();
        emp3.displayDetails();
        emp4.displayDetails();
    }
}
