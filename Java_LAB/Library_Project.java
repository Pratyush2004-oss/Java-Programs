package Java_LAB;

import java.util.Scanner;

class Book {
    String[] BookCollection = { "Python", "Java", "C++", "Web Dev", "Artificial Intelligance", "Machine Learning",
            "Data Science" };
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    public String item = null;

    String Input() {
        System.out.print("\nEnter the book you are searching for : ");
        item = sc.nextLine();
        return item;
    }

    String Search() {
        System.out.println("****************  Searching for a book  ********************");
        int count = 0;
        item = Input();
        for (String i : BookCollection) {
            if (item.equalsIgnoreCase(i)) {
                System.out.println(i + "..... Book Available!.........");
                count = 1;
                item = i;
                return item;
            }
        }
        if (count == 0) {
            System.out.println("Sorry, No such book found!");
        }
        return null;
    }

    void Issue() {
        System.out.println("\n*************   Issuing a book   *******************\n");
        int count = 0;
        item = Input();
        for (String i : BookCollection) {
            if (item.equalsIgnoreCase(i)) {
                count = 1;
                System.out.print("Enter the days for which you want to issue the book : ");
                int days = sc.nextInt();
                System.out.println("The book " + item + " will be issued for " + days + " Days.");
            }
        }
        if (count == 0) {
            System.out.println("Sorry, No such book found!");
        }
    }

    void Renew() {
        System.out.println("\n*************   Renewing a book   ******************\n");
        item = Input();
        int count = 0;
        for (String i : BookCollection) {
            if (item.equalsIgnoreCase(i)) {
                count = 1;
                System.out.print("Enter the days for which you want to Renew the issuing days for the book : ");
                int days = sc.nextInt();
                System.out.println("The issue date of The book " + item + " will be extended for " + days + " Days.");
            }
        }
        if (count == 0){
            System.out.println("This Book is not of our Library......");
        }
    }

    void Return() {
        System.out.println("\n*************   Returning a book   ******************\n");
    }

    void FineCollection() {
        System.out.println("\n*************   Showing Fine Collection   ******************\n");
    }

}

public class Library_Project {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println(" Press 1 for Search...\n Press 2 for Issuing...\n Press 3 for Renew\n Press 4 for Return... \n Press 5 for Fine Calculation\n\n");
            System.out.print("Enter Your Choice : ");
            choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    new Book().Search();
                }
                    break;
                case 2: {
                    new Book().Issue();
                }
                    break;
                case 3: {
                    new Book().Renew();
                    break;
                }
                case 4: {

                }
                case 5: {

                }
                default: {
                    System.out.println("Invalid Choice");
                }
            }
        } while (choice != 5);
    }

}
