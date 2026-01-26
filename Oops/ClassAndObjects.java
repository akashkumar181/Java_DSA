package Oops;
class Car{
    String make="Mahindra";
    String model="Scropio";
    double Price =1800768.678;
    void Display(){
        System.out.print("This is car");
    }
}
public class ClassAndObjects {
    public static void main(String[] args) {
       Car car1= new Car();
       System.out.println(car1.make);
       System.out.println(car1.model);
       car1.Display();
        Car car2= new Car();
       System.out.println(car2.make);
       System.out.println(car2.model);
       car2.Display();
    }
}
