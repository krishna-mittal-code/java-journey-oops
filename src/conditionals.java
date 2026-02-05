import java.util.Scanner;
public class conditionals{

     public static void main(String[] args) {
        int a=11;
        // cannot pass assignmet operator in if statement
        //if(a=11){--------->❌
        if(a==11){
            System.out.println("i am 11");
        }
        else{
            System.out.println("i am 10");
        }

        Scanner s= new Scanner(System.in);
        float sub1,sub2,sub3;
        System.out.println("Enter the marks of Sub1: ");
        sub1=s.nextFloat();
        System.out.println("Enter the marks of Sub2: ");
        sub2=s.nextFloat();
        System.out.println("Enter the marks of Sub3: ");
        sub3=s.nextFloat();
        
        float total= (sub1+sub2+sub3);
        if(sub1>33.0f && sub2>33.0f && sub3>33.0f){
            if(total>40.0f){
                System.out.println("You are passed..");
            }
            else{
                System.out.println("you are not passed. has to appear for reexam");
            }
        }
        else{
            System.out.println("You are failed.");
        }




    }
}