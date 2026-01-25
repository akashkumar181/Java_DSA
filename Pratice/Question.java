package Pratice;

public class Question {
    public static void main(String[] args) {
    //     int n=486;
    //     int sum=0;
    //     while(n!=0){
    //         int r=n%10;
    //         n=n/10;
    //         sum=sum+r;
    //     }
    //     System.out.println(sum);
    //     //----next
    //  int rev=0;
    //  int m=67;
    //  int tem=m;
    //  while(m!=0){
    //     int r=m%10;
    //     m=m/10;
    //     rev=rev*10+r;

    //  }
    //  System.out.println(rev);
    //  if(m==tem){
    //     System.out.println("Pallidrome");
    //  }else{
    //     System.out.println("not pallidrome");
    //  }
    //  //--amstrong no
    //  int count=0;
    //  int p=123;
    //  int val=0;
    //  int temp = p;
    // while(temp != 0) {
    //         temp /= 10;
    //         count++;
    //     }
    //  while(p!=0){
    //     int r=p%10;
       
    //     p=p/10;
    //     val=val+(int)Math.pow(r,count);
    //  }
    //  //find a largest digit in a number
    //  int num=678;
    //  int max=0;
    //  while(num!=0){
    //     int r=num%10;
    //     num=num/10;
    //     if(r>max){
    //         max=r;
    //     }else{
    //         max=max;
    //     }
    //  }
    //  System.out.println(max);
     //covert number a decimal tp binary 
   
     int dec = 55;
        int temp = dec;
        int binary = 0;
        int place = 1;

        while (temp > 0) {
            int r = temp % 2;     // remainder
            binary = binary + (r * place);
            place = place * 10;
            temp = temp / 2;
        }
        //--Perfect number
        int n=6;
        int sum=0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
              sum=sum+i;
            }
        }
        System.out.println(sum);
     if(n==sum){
        System.out.println("Perfect Number");
     }else{
        System.out.println("Not Perfect Number");
     }
    

     
    }
}
