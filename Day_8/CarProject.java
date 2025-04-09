package Day_4;

public class CarProject {
    int year;
    String make;
    String model;
    String color;
    // this is a constructor
    CarProject(int year,String make,String model,String color){
        this.make=make;
        this.color=color;
        this.model=model;
        this.year=year;

    }
    void displayDetails(){
        System.out.println("Car maker:"+make);
        System.out.println("Car color :"+color);
        System.out.println("Car year:"+year);
        System.out.println("Car model:"+model);
    }

    public static void main(String[] args) {
        CarProject project1=new CarProject(2021, "Ford","Mustang" , "Blue");
        project1.displayDetails();
        System.out.println();
        CarProject project2=new CarProject(2010, "Audi","Q4" , "White");
        project2.displayDetails();

        
    }
}

// Create a class Car with attributes like make, model, year, and color. Include 
// a method displayDetails() to print the car's details.
//  • Create an object of the Car class and call the displayDetails() method.
//  • Add a constructor to initialize the values of the attributes when creating 
// an object