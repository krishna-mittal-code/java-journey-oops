import java.util.Scanner;
public class multidimarray {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int [][] flats;
        flats = new int[3][2];
        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                System.out.println("Enter room number");
                flats[i][j]=s.nextInt();
            }
        }
        System.out.println("Displaying");
        for(int i=0;i<flats.length;i++){
            for(int j=0;j<flats[i].length;j++){
                System.out.printf("%d\t",flats[i][j]);
            }
            System.out.println();
        }
    }
}
