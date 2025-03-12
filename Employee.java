package Day_11;
import java.util.Scanner;
public class Employee {
    private int num;
    private String name;
    private double salary;
    private char Gender;

    // setter methods

    public void setNum(int num){
        this.num=num;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }
    public void setGender(char gen){
        this.Gender=gen;

    }

    // getter methods

    public void getNum(){
        System.out.println("Employee Number: "+this.num);
    }
    public void getName(){
        System.out.println("Employee Name: "+this.name);
    }
    public void getSalary(){
        System.out.println("Employee Salary: "+this.salary);
    }
    public void getGender(){
        System.out.println("Employee gender:"+this.Gender);
    }

    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the employee Details (Number,Name,Salary,Gender): ");
        int num=sc.nextInt();
        String name=sc.nextLine();
        double salary=sc.nextDouble();
        char gen=sc.next().charAt(0);

        // Created the object of the class
        Employee emp=new Employee();
        emp.setNum(num);
        emp.setName(name);
        emp.setSalary(salary);
        emp.setGender(gen);
        // display the employee details
       System.out.println("Employee Details: ");
        emp.getNum();
        emp.getName();
        emp.getSalary();
        emp.getGender();
        sc.close();     

    }
}
