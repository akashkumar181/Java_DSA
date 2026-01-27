package Oops;
import java.util.*;
class Humann {
    String name;
    int age;
    double weight;

  

    // 2️⃣ Constructor with name
    Humann(String name) {
        this.name = name;
    }

    // 3️⃣ Constructor with name and age
    Humann(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 4️⃣ Constructor with all details
    Humann(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
}


public class OverloadedConstructor {
   public static void main(String[] args) {
//     1️⃣ What is Constructor Overloading?
//  👉 Constructor overloading means
//    having more than one constructor in the same class, but with different parameter lists.

//  **Same constructor name (class name)
//  Different:
//  number of parameters OR
//  type of parameters OR
//  order of parameters
   
   Humann h2 = new Humann("Mohan");
   Humann h3 = new Humann("Sohan", 20);
   Humann h4 = new Humann("Ravi", 22, 70.5);


   } 
}
