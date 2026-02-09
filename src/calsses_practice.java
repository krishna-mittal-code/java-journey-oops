class employee{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String newName){
        name=newName;
        System.out.println("Name changed.");
    }
}
public class calsses_practice {
    public static void main(String[] args) {
        employee employee1 = new employee();
        employee1.name="Krishna";
        employee1.salary=40000;
        System.out.println("The name of the employee1 is "+employee1.getName());
        System.out.println("The salary of "+employee1.name+" is "+employee1.getSalary()); 
        employee1.setName("jai");
        
        System.out.println("The name of the employee1 is "+employee1.getName());
    }
    
}
