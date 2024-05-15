package Java_LAB;

import java.util.Scanner;

class Book {
    String[] BookCollection = {"Python","Java","C++","Web Dev","Artificial Intelligance", "Machine Learning", "Data Science"};
    @SuppressWarnings("resource")
    void Search(){
        System.out.println("****************  Searching for a book  ********************");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Book you are searching for : ");
        String item = sc.nextLine();
        int count = 0;
        for(String i : BookCollection){
            if (item.equalsIgnoreCase(i)){
                System.out.println(i + "..... Book Available!.........");
                count = 1;
            }
        }
        if(count == 0){
            System.out.println("Sorry, No such book found!");   
        }
    }

    void Issue(){
        System.out.println("\n*************   Issuing a book   *******************\n");
    }

    void Renew(){
        System.out.println("\n*************   Renewing a book   ******************\n");
    }

    void Return(){
        System.out.println("\n*************   Returning a book   ******************\n");
    }

    void FineCollection(){
        System.out.println("\n*************   Showing Fine Collection   ******************\n");
    }

}

public class Library_Project {
    public static void main(String[] args) {
        Book b = new Book();
        b.Search();
    }

}
