package SelfJava;
import java.util.*;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> food =new ArrayList<String>();
        food.add("rice");
        food.add("pluses");
        food.add("Bread");

        for(int i=0;i<food.size();i++){
            System.out.println(food.get(i));
        }
            // get(index) → returns element at index
        System.out.println(food.get(0)); // Rice

        // set(index, element) → replaces element at index
        food.set(2, "Chapati");

        // size() → returns number of elements
        System.out.println(food.size());

        // contains(element) → checks element present or not
        System.out.println(food.contains("Rice")); // true

        // remove(index) → removes element at index
        food.remove(1);

        // remove(object) → removes specific element
        food.remove("Rice");

        // isEmpty() → checks list is empty or not
        System.out.println(food.isEmpty());

        // clear() → removes all elements
        //food.clear();

        // printing ArrayList
        System.out.println(food);


    }
}
