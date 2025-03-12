package Day_5.Experiment_6;

class Vehicle {
    private String model;
    private int year;
    public Vehicle(String model, int year) {
        this.model = model;
        this.year = year;
    }
    public void displayInfo() {
        System.out.println("Vehicle Model: " + model + ", Year: " + year);
    }
}

// subclass
class Car extends Vehicle {
    private int numDoors;
    private String fuelType;

    public Car(String model, int year, int numDoors, String fuelType) {
        super(model, year);
        this.numDoors = numDoors;
        this.fuelType = fuelType;
    }

    public void displayCarInfo() {
        displayInfo();
        System.out.println("Doors: " + numDoors + ", Fuel Type: " + fuelType);
    }
}

public class VehicleSystem {
    public static void main(String[] args) {
        Car car = new Car("Ford Mustang", 1964, 4, "Petrol");
        car.displayCarInfo();
    }
}


