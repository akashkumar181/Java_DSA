package SelfJava;
import java.util.*;
public class ForEachLoop {
    public static void main(String[] args) {
        String [] animals={"Cat","Dog","Birds"};
        for(String i:animals){
            System.out.println(i);
        }
            ArrayList<String> food =new ArrayList<String>();
        food.add("rice");
        food.add("pluses");
        food.add("Bread");
        for(String i:food){
            System.out.println(i);
        }
        
    }
}
