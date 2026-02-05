import java.util.Scanner;
public class prog1 {
    public static void main(String[] args) {
        System.out.println("Welcome to my first program");
        Scanner s= new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = s.nextInt();
        System.out.print("Enter second number: ");
        int b = s.nextInt();
        System.out.println("The resultant addition is : "+(a+b));
    }
}
