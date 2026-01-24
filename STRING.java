import java.util.*;
public class STRING {
    public static void main(String[] args) {
        //it is stored in heap memory
        //it is immutable

    //     String s= "Alice"; //intilization
    //     System.out.println(s.charAt(2)); //by index we get value
    //     System.out.println(s.length());
    //     String str="welcomeTojava";
    //     char[] ch = str.toCharArray(); // keeping character into character array
    //     System.out.println(ch[7]);
    //     String cars []={"volvo","bmw","ford"};
    //     cars[1]="maybach";
    //     System.out.println(cars[1]);
    //     //another way to initlize string array
    //     String[] fruits=new String[3];
    //     fruits[1]="apple";
    //     System.out.println(ch[7]);
        String str1="javacodingisfun";
        String strr=str1.concat(str1);
        System.out.println(str1.concat("hello"));
        String str2="java";
        String str3=new String("java");
        System.out.println(str1==str2);//it is pointing same object
        System.out.println(str1==str3); //it is pointing two different object //baat address ki hoti h
        System.out.println(str1.equals(str3));//it is only matching the value
    //     System.out.println(str1.substring(3));
    //     System.err.println(str1.substring(3,7));//end index is not included
    //    //substring gives new string not subpart
    //     System.out.println(str1.toLowerCase());
    //     System.out.println(str2.toUpperCase());
        // String str5="abc";
        // String str6=str5 + "xyz";
        // System.out.println(str6);
      
        // for(int i=0;i<str5.length();i++){
        //     for(int j=i+1;j<=str5.length();j++){
        //         System.out.println(str5.substring(i, j));
        //     }
        // }
       //read string builder and string buffer
        


    }
}
