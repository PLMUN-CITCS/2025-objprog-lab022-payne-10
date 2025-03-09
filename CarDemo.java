// The Car class acts as a blueprint for creating Car objects
class Car {
    // Attributes (instance variables)
    String make;
    String model;
    int year;

    // Method to display car information
    public void displayInfo() {
        System.out.println("Car: " + year + " " + make + " " + model);
    }
}

// The main class where execution begins
public class CarDemo {
    public static void main(String[] args) {
        // Creating a Car object
        Car myCar = new Car();
        
        // Assigning values to attributes
        myCar.make = "Toyota";
        myCar.model = "Corolla";
        myCar.year = 2020;
        
        // Calling the displayInfo method to print car details
        myCar.displayInfo();
    }
}