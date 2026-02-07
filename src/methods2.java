// _______________________________METHOD OVERLOADING__________________________________________
// WHEN A METHOD OF SAME NAME IS USED BUT IN DIFFERENT USAGE AREA WITH CHANGE IN PARAMETERS 
import java.util.Scanner;
public class methods2 {
    static void greet(){
        System.out.println("Hello Dear!!");  //a void function named greet  
    }
    static void greet(int a){
        for(int i=1;i<a;i++){
            System.out.println("Hello "+i);  // a void function with same name but cahnge in  parameters.
        }
    }
    // keepin mind you cannot change the returm type in method overloading


    // MULTIPKLE ARGUMENTS IN FUNCTION ............TAKES AN ARRAY OF ARGUMENTS AND PROCEEDS FURTHER
    static int add(int ...arr){
        int result=0;
        for(int i:arr){
            result+=i;
        }
        return result;

    }
    public static void main(String[] args) {
        greet();
        greet(3);

        int k=add(1,2,3,4,5,6,7,8,9);
        System.out.println(k);
    }
    
    
}
