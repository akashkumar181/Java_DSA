package Oops;
class Human{
    String name;
    int age;
    Double weight;
    Human(String name,int age,Double weight){
        this.name=name;
        this.age=age;
        this.weight=weight;
    }
    void eat(){
        System.out.println(this.name+"is eating.");
    }
}
public class Constrctors {
    public static void main(String[] args) {
        Human human1=new Human("Mohan",19,167.98);
        Human human2=new Human("Sohan",20,170.98);
        System.out.println(human1.name);
        System.out.println(human2.name);
        human1.eat();
        human2.eat();

    }
}
