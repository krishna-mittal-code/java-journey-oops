class base{   // superclass of derived
    int x;
    base(){
        System.out.println("i am in base ");
    }
}
 class derived extends base{    //subclass of base inherited attributes of basse class using "extends" keywordg
    int y;
    derived(){
        System.out.println("i am in derived");
    }
 }

public class inheritance {
    public static void main(String[] args) {
        
        base b1 =new base();
        b1.x=3;
        System.out.println(b1.x);
        
        derived d1 =new derived();
        d1.x=90;
        d1.y=9;
        System.out.println(d1.x);
        System.out.println(d1.y);
        
    }
    

    
}
