import java.util.Scanner;

public class array {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] marks = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.printf("Enter the value %d: ", i+1);
            marks[i] = s.nextInt();
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.printf("%d\n", marks[i]);
        }

    }
}
