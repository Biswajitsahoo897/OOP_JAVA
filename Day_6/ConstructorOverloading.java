package Day_6;

public class ConstructorOverloading {
    int empID;
    String empName;
    String dept;

    ConstructorOverloading(int empID,String empName ,String dept){
        this.dept=dept;
        this.empID=empID;
        this.empName=empName;
    }
    void getEmployeeDetails(){
        System.out.println("Employee Name:"+empName+"  Department :"+dept+"  EmpID:"+empID);
    }
        public static void main(String[] args) {
            ConstructorOverloading obj_1=new ConstructorOverloading(378201, "Manoj Sahoo", "CSE");
            obj_1.getEmployeeDetails();
        }
    }
    

