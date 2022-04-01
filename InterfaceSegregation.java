/**
 *SOLID Principles -
 * SOLID is an acronym for the five object-oriented design
 *
 * S - Single Responsibilty Priciple - A class should have one and only reason to change
 * O - Open Closed Principle         - Objects or Entities open for extension and closed for modification
 * L - Liskov Substitution Priciple  - Objects of Super class shall be replaced with objects of subclasses
 * I - Interface Segregation Priciple - A client should never be forced to implement an interface that not use
 * D -
 */

/**

interface Restaurant{
    void vegMeals();
    void nonVegMeals();
}

class ABCVegRestaurant implements Restaurant{

    public void vegMeals(){
        System.out.println("provide veg meals");
    }

    public void nonVegMeals(){
        System.out.println("Sorry I don't");
    }
}

 */

interface VegRestaurant{
    void vegMeals();
}

interface NonVegRestaurant{
    void nonVegMeals();
}

class ABCVegRestaurant implements VegRestaurant{

    public void vegMeals(){
        System.out.println("provide veg meals");
    }
}

class XYZRestaurant implements VegRestaurant,NonVegRestaurant{

    public void vegMeals(){
        System.out.println("provide veg meals");
    }

    public void nonVegMeals(){
        System.out.println("provide non veg meals ");
    }
}

public class InterfaceSegregation {
    public static void main(String args[]){

    }
}
