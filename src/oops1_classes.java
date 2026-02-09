import java.util.Scanner;

class employee {
    int id;
    String name;

    public void printdetails() {
        System.out.println("My name is " + name + " and my id is " + id);
    }
}

public class oops1_classes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        employee employee1 = new employee(); // initiating the FIRST OBJECT of the class employee
        System.out.print("Enter the name of the employee: ");
        employee1.name = s.nextLine();
        System.out.print("Enter the id of the employee " + employee1.name);
        employee1.id = s.nextInt();
        employee1.printdetails();
        s.nextLine();
        
        // System.out.print("Enter the name of the employee: ");// ____________this will overwrite the object created above
        //                                                      // to add new deatails create new object as above
        // employee1.name = s.nextLine();
        // System.out.print("Enter the id of the employee " + employee1.name);
        // employee1.id = s.nextInt();
        // employee1.printdetails();
        
        employee employee2= new employee();
        System.out.print("Enter the name of the employee: ");
        employee2.name = s.nextLine();
        System.out.print("Enter the id of the employee " + employee2.name);
        employee2.id = s.nextInt();
        employee2.printdetails();
        
    }
}
