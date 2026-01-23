package Class;
import java.util.Scanner;

public class Pattern {
    public static void main(String[] args){
       //normal pattern
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter you row no: ");
       int n=sc.nextInt();
       for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            System.out.print(" * ");
        }
        System.out.println();
       }
        System.out.println();
    //next--
       for(int i=0;i<n;i++){
        for(int j=0;j<i+1;j++){
            System.out.print(" * ");
        }
        System.out.println();
       }
        System.out.println();
    //next--
    for(int i=0;i<n;i++){
        for(int j=0;j<n-i-1;j++){
            System.out.print(" ");
        }
        for(int k=0;k<i+1;k++){
            System.out.print("*");
        }
        System.err.println();
    }
     System.out.println();
    // //next-- pascal Triangle
    for(int i=0;i<n;i++){
        for(int j=0;j<n-i-1;j++){
            System.out.print(" ");
        }
        for(int k=0;k<2*i+1;k++){
            System.out.print("*");
        }
        for(int m=0;m<n-i-1;m++){
            System.out.print(" ");
        }
        System.out.println();
    }
    //next-- frame
   System.out.println();
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            if(j==0 || j==n-1 || i==0|| i==n-1 ){
                System.out.print("* ");
            }else{
                System.out.print("  ");
            }
        }
        System.out.println();
    }
     System.out.println();
    //next-- Diamond shape
     for(int i=0;i<n;i++){
        for(int j=0;j<n-i-1;j++){
            System.out.print(" ");
        }
        for(int k=0;k<2*i+1;k++){
            System.out.print("*");
        }
        for(int m=0;m<n-i-1;m++){
            System.out.print(" ");
        }
        System.out.println();
    }
     for(int i=n-2;i>=0;i--){
        for(int j=0;j<n-i-1;j++){
            System.out.print(" ");
        }
        for(int k=0;k<2*i+1;k++){
            System.out.print("*");
        }
        for(int m=0;m<n-i-1;m++){
            System.out.print(" ");
        }
        System.out.println();
    }
   System.out.println();
    
      for(int i=n-1;i>=0;i--){
        for(int j=0;j<n-i-1;j++){
            System.out.print(" ");
        }
        for(int k=0;k<2*i+1;k++){
            System.out.print("*");
        }
        for(int m=0;m<n-i-1;m++){
            System.out.print(" ");
        }
        System.out.println();
    }
    //next--
     System.out.println();
     for(int i=0;i<n;i++){
        for(int j=0;j<i+1;j++){
            System.out.print(j+1);
        }
        for(int k=0;k<2*n-2-2*i;k++){
            System.out.print(" ");
        }
        for(int p=i+1;p>=1;p--){
            
            System.out.print(p);
           
        }
        System.out.println();
     }
     //next--
      System.out.println();
     for(int i=n-1;i>=0;i--){
        for(int j=0;j<i+1;j++){
            System.out.print("*");
        }
        for(int k=0;k<2*n-2-2*i;k++){
            System.out.print(" ");
        }
        for(int p=i+1;p>=1;p--){
            
            System.out.print("*");
           
        }
        System.out.println();
     }
      
     for(int i=0;i<n;i++){
        for(int j=0;j<i+1;j++){
            System.out.print("*");
        }
        for(int k=0;k<2*n-2-2*i;k++){
            System.out.print(" ");
        }
        for(int p=i+1;p>=1;p--){
            
            System.out.print("*");
           
        }
        System.out.println();
     }
      System.out.println();
      //next--
      for(int i=0;i<n;i++){
        for(int j=0;j<i+1;j++){
            System.out.print("*");
        }
        for(int k=0;k<n-i-3;k++){
            System.out.print(" ");
        }
         System.out.println();
      }
      for(int i=n-2;i>=0;i--){
        for(int j=0;j<i+1;j++){
            System.out.print("*");
        }
        for(int k=0;k<n-i-3;k++){
            System.out.print(" ");
        }
         System.out.println();
      }
      //next--
      for(int i=0;i<n;i++){
        for(int j=0;j<i+1;j++){
            if((i+j)%2==0){
                System.out.print(1);
            }else{
                System.out.print(0);
            }
         
        }
         System.out.println();
      }


    
   


    }
}
