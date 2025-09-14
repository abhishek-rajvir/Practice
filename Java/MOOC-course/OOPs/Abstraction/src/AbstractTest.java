// Abstract class
abstract class Vehicle{
    // abstract method
    abstract void start();// no body

    // non-abstract method
    void fuel(){
        System.out.println("Filling fuel..");
    }
}

//Car class extends to vehicle class
class Car extends Vehicle{
    // implementing abstract method
    void start(){
        System.out.println("Starting car..");
    }
}

// main class
class AbstractTest{
    // main method
    public static void main(String[] args){
        // Car instance
        Car c = new Car();
        c.start();
        c.fuel();
    }
}