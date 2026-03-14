package libraryProject;

import java.util.*;

class lib {
    static String arr[] = new String[50];
    String issue[];

    lib() {

        System.out.println("Welcome to the library ");
        issue = new String[50];

    }

    void issue(String book) {
        for (int j = 0; j < this.issue.length; j++) {
            if (issue[j] != null && issue[j].equalsIgnoreCase(book)) {
                System.out.println("Book already issued and not returned");
                return;
            } else {

                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] != null && arr[i].equalsIgnoreCase(book)) {
                        System.out.println(book + " issued ");
                        arr[i] = null;
                        for (int k = 0; k < (this.issue.length); k++) {
                            if (issue[k] == null) {
                                issue[k] = book;
                            }

                        }
                        return;
                    }

                }

            }

        }
        System.out.println("No such book available");
        return;

    }

    void show() {
        System.out.println("Available books are:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                System.out.println(arr[i]);
            } else {
                continue;
            }
        }
    }

    void addBook(String Book) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                arr[i] = Book;
                System.out.println("book added");
                return;
            }
        }
        System.out.println("can not be added");

    }

    void returnBook(String book) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                arr[i] = book;
                System.out.println("Book returned");
                break;
            }
        }
        for (int j = 0; j < this.issue.length; j++) {
            if (this.issue[j] != null && this.issue[j].equalsIgnoreCase(book)) {
                this.issue[j] = null;
                return;
            }

        }
    }

    void choice() {
        Scanner s = new Scanner(System.in);
        int ch = 0;
        String name;

        while (true) {
            System.out.println("Enter 1 to issue book,2 to return book,3 to add book");
            ch = s.nextInt();
            s.nextLine();
            if (ch == 1) {

                this.show();
                System.out.println("Enter name of the book you want.");
                name = s.nextLine();
                this.issue(name);
            } else if (ch == 2) {
                System.out.println("Enter name of book to return");
                name = s.nextLine();

                this.returnBook(name);

            } else if (ch == 3) {
                System.out.println("Enter name of book");
                name = s.nextLine();
                this.addBook(name);

            } else {
                System.out.println("Invalid valid input");
                break;
            }
        }

    }

}

public class libraryProject {
    public static void main(String[] args) {

        lib student1 = new lib();
        student1.choice();

    }

}
