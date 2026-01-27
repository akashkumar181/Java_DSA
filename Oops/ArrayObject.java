package Oops;
class Food{
    String name;
    Food(String name){
        this.name=name;
    }
   
}
public class ArrayObject {
    public static void main(String[] args) {
        //Food[] array=new Food[3];
       
        
        Food food1=new Food("Pizza");
        Food food2=new Food("Sauce");
        Food food3=new Food("Veg parcel");
        Food [] array= {food1,food2,food3};//another way
        // array[0]=food1;
        // array[1]=food2;
        // array[2]=food3;
        System.out.println(array[0].name);
        System.out.println(array[1].name);
        System.out.println(array[2].name);

    }
}
