package SelfJava;

public class TwoDArray {
    public static void main(String[] args) {
        String[][] cars=new String[3][3];
        cars[0][0]="Mahindra";
        cars[0][1]="Tata";
        cars[0][2]="Ashok Leyland";
        cars[1][0]="BMW";
        cars[1][1]="SAFARI";
        cars[1][2]="LANDEOVER";
        cars[2][0]="Rangerover";
        cars[2][1]="Frari";
        cars[2][2]="Merceds";
        System.out.println(cars[0][1]);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println(cars[i][j]);
            }
        }
    }
}
