package Oops;

class Caar {

    String make;
    String model;
    int year;
    String color;

    Caar(String make, String model, int year, String color){
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    @Override
    public String toString(){
        return this.color + " " + this.year + " " + this.make + " " + this.model;
    }
}
public class toStringMethod {
    public static void main(String[] args) {
         // .toString() = Method inherited from the Object class.
        //                       Used to return a string representation of an object.
        //                       By default, it returns a hash code as a unique identifier.
        //                       It can be overridden to provide meaningful details.
        
        Caar car1 = new Caar("Ford", "Mustang", 2025, "Red");
        Caar car2 = new Caar("Chevrolet", "Corvette", 2026, "Blue");

        System.out.println(car1);
        System.out.println(car2);
        
    }
}
