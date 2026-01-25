package SelfJava;
import java.util.*;
public class RandomNumber {
    public static void main(String[] args) {
        Random random=new Random();
        // int x=random.nextInt(6)+1;
        //as we add it does not give 0 has random value 6 is hieghest bound in they give value
    
        // double  x=random.nextDouble();
        boolean  x=random.nextBoolean();
        
        System.out.print(x);
    }
}
