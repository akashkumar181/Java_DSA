package Oops;
class Animall{

    void move(){
        System.out.println("This animal is running");
    }
}
class Doggg extends Animall{

}
class Cattt extends Animall{

}
class Fishhh extends Animall{

    @Override
    void move(){
        System.out.println("This animal is swimming");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        
        // Method overriding = When a subclass provides its own
        // implementation of a method that is already defined.
        // Allows for code reusability and gives specific implementations.

        Doggg dog = new Doggg();
        Cattt cat = new Cattt();
        Fishhh fish = new Fishhh();

        dog.move();
        cat.move();
        fish.move();
    }
}
