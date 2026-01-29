package Oops;
class Organism {

    boolean isAlive;

    Organism(){
        isAlive = true;
    }
}
class Plant extends Organism{

    void photosynthesize(){
        System.out.println("The plant absorbs sunlight");
    }
}
class Animal extends Organism{

    void eat(){
        System.out.println("This animal is eating");
    }
}
class Dog extends Animal{

    int lives = 1;

    void speak(){
        System.out.println("The dog goes *woof*");
    }
}
class Cat extends Animal{

    int lives = 9;

    void speak(){
        System.out.println("The cat goes *meow*");
    }
}
public class Inheritence {
    public static void main(String[] args) {
        // Inheritance = One class inherits the attributes and methods
        //                         from another class.

        Dog dog = new Dog();
        Cat cat = new Cat();
        Plant plant = new Plant();
        System.out.println(plant.isAlive);
        System.out.println(cat.isAlive);
        System.out.println(dog.isAlive);

    }
}
