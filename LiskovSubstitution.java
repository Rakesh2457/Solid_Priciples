/**
 *SOLID Principles -
 * SOLID is an acronym for the five object-oriented design
 *
 * S - Single Responsibilty Priciple - A class should have one and only reason to change
 * O - Open Closed Principle         - Objects or Entities open for extension and closed for modification
 * L - Liskov Substitution Priciple  - Objects of Super class shall be replaced with objects of subclasses
 * I -
 * D -
 */

class Vehicle {
    public void start(){
        System.out.println("Starting a vehicle ");
    }

    public void stop(){
        System.out.println("stopping a vehicle ");
    }
}

class Bike extends Vehicle {
    public void start(){
        System.out.println("Starting a bike  ");
        // throw new RuntimeException
    }

    public void stop(){
        System.out.println("stopping a bike  ");
    }
}

class Car extends Vehicle {
    public void start(){
        System.out.println("Starting a car  ");
    }

    public void stop(){
        System.out.println("stopping a car  ");
    }
}
public class LiskovSubstitution {

    static void testDrive(Vehicle vehicle){
        vehicle.start();
        vehicle.stop();
    }

    public static void main(String args[]){
        int i =0 ;
        while (i<100){
            System.out.println("hii");
            i++;
        }
        testDrive(new Vehicle());
        testDrive(new Bike());
        testDrive(new Car());
    }
}
