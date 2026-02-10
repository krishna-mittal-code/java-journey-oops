class employee {
    private int id;
    private String name;

    public void setName(String n) { // setter setting name as the user cannot do it directly into the main function.
                                    // Helps in applying the conditions and validations for setting name instead of
                                    // giving user direct access for the same.
        if (n.length() > 5) {
            name = n;
        } else {
            System.out.println("enter long name or full name"); // this condition will sete name to "null" if the
                                                                // condition becomes FALSE
        }

    }

    // # it is said to be a good design when validaton is done into setter only. Getter is just to return. 

    public String getName() { // just returns the name by applying conditions and validations according to
                              // you.
        if (name == null) {
            return "Inavalid name";
        }
        return name;

    }
    // ___________________Basically getters and setters limit the access of the
    // attributes to user and also help in validating the user inputs_____

    public void setId(int num) {
        id = num;
    }

    public int getId() {
        return id;
    }

}

public class getterSetters {
    public static void main(String[] args) {
        employee employee1 = new employee();
        employee1.setId(23);
        System.out.println(employee1.getId());
        employee1.setName("krish");
        System.out.println(employee1.getName());
    }

}
