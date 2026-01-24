


public class first {
    static int add(int a, int b) { //we have used static  becuase main main function has used static keyword for calling inside main i have used
    return a + b;
    //it is pass by value                         
}
    static int mul(int a, int b) { //we have used static  becuase main main function has used static keyword for calling inside main i have used
    return a * b;
                             
}
  static int sub(int a, int b) { //we have used static  becuase main main function has used static keyword for calling inside main i have used
    return a - b;
                             
}
static int re(int a, int b) { //we have used static  becuase main main function has used static keyword for calling inside main i have used
    return a % b;
                             
}
static int div(int a, int b) { //we have used static  becuase main main function has used static keyword for calling inside main i have used
    return a /b;
                             
}


public static void main(String[] args) {
 

//         System.out.println("Hello World");
// // | Data Type | Size            | Range             |
// // | --------- | --------------- | ----------------- |
// // | **byte**  | 1 byte (8 bits) | -128 to 127       |
// // | short     | 2 bytes         | -32,768 to 32,767 |
// // | int       | 4 bytes         | -2³¹ to 2³¹-1     |
// // | long      | 8 bytes         | -2⁶³ to 2⁶³-1     |


//         int a = 10;
//         int bb = 5;

//         System.out.println("Addition: " + (a + bb));
//         System.out.println("Subtraction: " + (a - bb));
//         System.out.println("Multiplication: " + (a * bb));
//         System.out.println("Division: " + (a / bb));
//         System.out.println("Modulus: " + (a % bb));
//         // byte
//         byte b = 100;
//         System.out.println("Byte Value: " + b);
//         System.out.println("Byte Min: " + Byte.MIN_VALUE);
//         System.out.println("Byte Max: " + Byte.MAX_VALUE);
//         System.out.println("Byte Size: " + Byte.BYTES + " bytes\n");
//     // short
//         short s = 1000;
//         System.out.println("Short Value: " + s);
//         System.out.println("Short Min: " + Short.MIN_VALUE);
//         System.out.println("Short Max: " + Short.MAX_VALUE);
//         System.out.println("Short Size: " + Short.BYTES + " bytes\n");

//         // int
//         int i = 50000;
//         System.out.println("Int Value: " + i);
//         System.out.println("Int Min: " + Integer.MIN_VALUE);
//         System.out.println("Int Max: " + Integer.MAX_VALUE);
//         System.out.println("Int Size: " + Integer.BYTES + " bytes\n");

//         // long
//         long l = 100000000L;
//         System.out.println("Long Value: " + l);
//         System.out.println("Long Min: " + Long.MIN_VALUE);
//         System.out.println("Long Max: " + Long.MAX_VALUE);
//         System.out.println("Long Size: " + Long.BYTES + " bytes");
    //     int x=10;
    //     int y=20;
    //    x > y ? System.out.println(x) : System.out.print(y);
        // int age=43;
        // if(age>=18){
        //     System.out.println("You can vote");
        // }else{
        //     System.out.println("You can not vote");
        // }
      //Scanner sc = new Scanner(System.in);
    //   int days = 2;
    //   switch (days) {
    //     case 1:
    //         System.out.println("Sunday");
    //         break;
    //     case 2:
    //         System.out.println("Monday");
    //     default:
    //         System.out.println("other days");
    //         break;
    //   }
    //Loops 

    // int i=0;
    // while(i<6){
    //     System.out.println(i);
    //     i++;
    // }
    // do{
    //     System.out.println(i); //statement
    //     i++;
    // }while(i<6);
    for(int i =1;i<10;i++){
       if(i==7){
        continue;
       }else{
        System.out.println(i);
       }
    }
    int a=10;
    int b=20;
    int result=mul(a, b);
    System.out.println(result);
    // first f=new first();
    // int resultt = f.addd(5, 3);
    // System.out.println(resultt);
    
     

        

    }
}

