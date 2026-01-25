package SelfJava;
import java.util.*;
public class Question {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your base: ");
        double b=sc.nextDouble();
        System.out.println("Enter your height: ");
        double h=sc.nextDouble();
        double q=Math.pow(b,2)+Math.pow(h,2);
        double result=Math.sqrt(q);
        System.out.println(result);
    }
}
