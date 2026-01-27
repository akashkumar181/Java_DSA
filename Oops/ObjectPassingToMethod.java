package Oops;
class Carrr{
    String name;
    Carrr(String name){
        this.name=name;
    }

}
class Garage{
    void park(Carrr car){
        System.out.println("The "+car.name+" is parked in the garage");
    }
}
public class ObjectPassingToMethod {
   public static void main(String[] args) {
     Carrr car1=new Carrr("BMW");
     Carrr car2=new Carrr("Audi");
     Garage garage=new Garage();
     garage.park(car1);
      garage.park(car2);
   } 
}
