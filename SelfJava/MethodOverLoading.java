package SelfJava;
import java.util.*;
public class MethodOverLoading {
    
    // 1️⃣ Method with two int parameters
    static int add(int a, int b) {
        return a + b;
    }

    // 2️⃣ Method with two double parameters
    static double add(double a, double b) {
        return a + b;
    }

    // 3️⃣ Method with int and double (different parameter types)
    static double add(int a, double b) {
        return a + b;
    }

    // 4️⃣ Method with three int parameters (different number of parameters)
    static int add(int a, int b, int c) {
        return a + b + c;
    }
    public static void main(String[] args) {
        
        System.out.println(add(10, 20));          // calls int, int
        System.out.println(add(10.5, 20.5));      // calls double, double
        System.out.println(add(10, 20.5));        // calls int, double
        System.out.println(add(1, 2, 3));         // calls int, int, int
    }
}
