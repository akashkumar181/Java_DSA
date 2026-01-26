package SelfJava;
import java.util.*;
public class TwoDArraylist {
    public static void main(String[] args) {
        ArrayList<String> Drink=new ArrayList();
        Drink.add("Soda");
        Drink.add("Lemon Water");
        Drink.add("Cold Coffe");
        ArrayList<String> Menu=new ArrayList();
       Menu.add("Veg Biryani");
        Menu.add("Naan");
       Menu.add("Paneer Butter Masala");
       ArrayList<ArrayList<String>> Resturant=new ArrayList();
       Resturant.add(Drink);
       Resturant.add(Menu);
       System.out.println(Resturant);
       System.out.println(Resturant.get(0));//Display one list that is on first index
       System.out.println(Resturant.get(0).get(0));//Display the firdt element of first list

    }
}
