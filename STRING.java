public class STRING {
    public static void main(String[] args) {
        String s= "Alice";
        System.out.println(s.charAt(2)); //by index we get value
        String str="welcomeTojava";
        char[] ch = str.toCharArray(); // keeping character into character array
        System.out.println(ch[7]);
        String cars []={"volvo","bmw","ford"};
        cars[1]="maybach";
        System.out.println(cars[1]);
        //another way to initlize string array
        String[] fruits=new String[3];
        fruits[1]="apple";
        System.out.println(ch[7]);


    }
}
