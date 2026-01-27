
public class  Array{
 public static void main(String[] args) {
    int min = Integer.MAX_VALUE;
    int [] arr=new int[10];
    arr[0]=1;
    arr[1]=2;
    arr[2]=3;
    arr[3]=4;
    arr[4]=5;
    arr[5]=6;
    arr[6]=90;
    arr[7]=8;
    arr[8]=9;
    arr[9]=10;
   
    for(int i=0;i<10;i++){
        if(arr[i]%2!=0){
        System.out.println(arr[i]+1);}
        else{
            System.out.println(arr[i]);
        }
    }

    int index=-1;
    for (int i = 0; i < 10; i++) {
      if(arr[i]>min){
           min = arr[i];   
           index = i;      
      }
    for (int j = i + 1; j < 10; j++) {
        if (arr[j] < min) {
            min = arr[j];   
            index = j;      
        }
    }

    
    int temp = arr[i];
    arr[i] = arr[index];
    arr[index] = temp;
}

    
 }
    
}
