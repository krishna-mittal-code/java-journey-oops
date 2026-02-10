//___________________________________________Constructors in inheritance___________________________________

class base1 {
    int x;

    base1() {

        System.out.println("i am in base");
    }

    base1(int x) {
        this.x = x;
        System.out.println("i am constructor carrying " + x);
    }
}

class derived1 extends base1 {
    int y;

    derived1() {
        // super(23);
        System.out.println("i am in derived");
    }

    derived1(int y) {
        super(y); // super() keyword is used to refer to the the constructor of the superclass and
                  // it takes arguments and calls the superclass overloaded constructor based दn
                  // the number of parameters passed
        this.y = y;
    }
}

public class inheriitance2 {
    public static void main(String[] args) {

        derived1 d1 = new derived1(34);
    }

}
