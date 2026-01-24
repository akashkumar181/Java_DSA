import java.util.*;
public class TakingInput {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter details: ");
        System.out.println("Enter age: ");
       int age=sc.nextInt();
       sc.nextLine();
        System.out.println("Enter name: ");
       String name=sc.nextLine();
        System.out.println("Enter marks: ");
       float marks=sc.nextFloat();
        System.out.println("Enter course: ");
          sc.nextLine();
       String course=sc.nextLine();
        System.out.println("Enter height: ");
       double height=sc.nextDouble();
       System.out.println(age);
       System.out.println(name);
       System.out.println(marks);
       System.out.println(course);
     System.out.println(height);

  
    }
}
