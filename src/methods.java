import java.util.Scanner;
public class methods {
    static int add(int a, int b) {// static is used to create a method for the class itself rather than the
                                  // objects. Objects need not to be declared to use the static method
        return a + b;
    }
    static void changearr(int [] arr){
        if((arr.length)<7){
            arr[3]=34;
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter number\t");
        int num1=s.nextInt();
        System.out.print("Enter number\t");
        int num2=s.nextInt();
        // System.out.printf("The resultant addition is %d",add(num1,num2));//call by value


        //______________________For Arrays______________________
        int [] array= {23,34,45,4523};     // HERE array contains the address value not the actual value
        changearr(array);   // CALL BY REFERENCE
        for(int i:array){
            System.out.println(i);
        }
}

}
