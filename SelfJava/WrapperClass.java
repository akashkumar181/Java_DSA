package SelfJava;

public class WrapperClass {
    public static void main(String[] args) {
        //autoboxing
        Boolean a=true;
        Character b='@';
        Integer c=123;
        Double d=3.14;
        String e="Bro";
        //boxing
        int n=10;
        Integer obj=Integer.valueOf(n);
        System.out.println(obj);
        Integer objj = 100;
        int nn = obj;   // unboxing happens automatically
        System.out.println(nn);
        Integer objjj= Integer.valueOf(100);
        int nnn= objjj.intValue();   // explicit unboxing
        System.out.println(nnn);



        

    }
}
