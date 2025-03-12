public class Employee {
    String Name;
    int year;
    String address;

    Employee(String Name, int year, String address) {
        this.Name = Name;
        this.year = year;
        this.address = address;
    }

    void Display() {
        System.out.printf("%-10s %-15s %-10s\n", Name, year, address);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Ujwal", 2024, "BBS");
        Employee e2 = new Employee("Ravi", 2023, "KUR");
        e1.Display();
        e2.Display();

    }
}
