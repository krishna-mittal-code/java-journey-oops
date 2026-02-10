class Studnet{
    int id;
    String name;
     public Studnet(){                    // __________Constructor with public access modifier that can be used even in different package
        System.out.println("Constructor  called...");
    }
    Studnet (int id, String name){        //________Constructor without public access modifier can only be used here only
        this.id=id;                //most real code uses same parameter names as of attributes (name,id) -> in this scenario "this." is used
        this.name=name;

    }
}
public class constructors {
    public static void main(String[] args) {
        Studnet s1= new Studnet();
        // Studnet s1= new Studnet(23,"krish");
        // System.out.println(s1.id);
        // System.out.println(s1.name);
        
    }
}
