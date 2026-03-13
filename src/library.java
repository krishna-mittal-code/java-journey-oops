import java.util.Scanner;

class func {
    static String bokArr[] = new String[50];

    static String issueArr[] = new String[50];

    static void addbook(String bookname) {
        for (int i = 0; i < (bokArr.length); i++) {
            if (bokArr[i] == null) {
                bokArr[i] = bookname;
                break;
            }
        }
    }

    static void issuebook(String bookname) {
        for (int i = 0; i < (bokArr.length); i++) {
            if (bokArr[i] != null) {
                if (bokArr[i].equals(bookname)) {
                    bokArr[i] = null;
                    System.out.println("you have issued " + bookname);
                    break;
                }

            }
        }
        System.out.println("the book you have entered is not available");

        if (issueArr.length <= 50) {
            for (int i = 0; i < (issueArr.length); i++) {
                if (issueArr[i] == null) {
                    issueArr[i] = bookname;
                    break;
                }
            }

        } else {
            System.out.println("no more books can be issued");
        }

    }

    static void returnbook(String bookname) {
        System.out.println("you have returned " + bookname);
        for (int i = 0; i < (bokArr.length); i++) {
            if (bokArr[i] == null) {
                bokArr[i] = bookname;
                break;
            }
        }
    }

    static void showavailablebooks() {
        for (int i = 0; i < (bokArr.length); i++) {
            if (bokArr[i] != null) {
                System.out.println(bokArr[i]);
            }
        }
    }

}

public class library {
    public static void main(String[] args) {
        System.out.println("welcome to library");
        Scanner s = new Scanner(System.in);
        while (true) {
            int choice;
            System.out.println(
                    "enter 1 to show available books, enter 2 to issue a book, enter 3 to return a book ,enter 4 to add a book");
            choice = s.nextInt();
            if (choice == 1) {
                func.showavailablebooks();
            } else if (choice == 2) {
                System.out.println("enter the name of the book you want to issue");
                s.nextLine();
                String bookname = s.nextLine();
                func.issuebook(bookname);
            } else if (choice == 3) {
                System.out.println("enter the name of the book you want to return");
                s.nextLine();
                String bookname = s.nextLine();
                func.returnbook(bookname);
            } else if (choice == 4) {
                System.out.println("enter the name of the book you want to add");
                s.nextLine();
                String bookname = s.nextLine();
                func.addbook(bookname);
            } else {
                break;
            }

        }

    }

}
