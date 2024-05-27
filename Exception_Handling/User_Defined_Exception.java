package Exception_Handling;

import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String msg) {
        System.out.println(msg);
    }
}

public class User_Defined_Exception {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Age of the Person: ");
        int age = scan.nextInt();
        try {
            vote(age);

        } catch (Exception e) {
            // TODO: handle exception
            // e.printStackTrace();
        }
    }

    public static void vote(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Not ELigible to Vote");
        } else {
            System.out.println("Eligible to Vote");
        }
    }
}
