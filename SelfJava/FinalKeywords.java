package SelfJava;
import java.util.*;
public class FinalKeywords {
    public static void main(String[] args) {
            final int MAX = 100;
        // MAX = 200; ❌ error (cannot reassign)
       //After using final keywaords we can not update our value
        System.out.println(MAX);
    }
}
