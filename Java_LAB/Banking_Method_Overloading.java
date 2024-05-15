package Java_LAB;

import java.util.*;

class Bank {
    public double balance = 1500000.0; // balance in the account
    @SuppressWarnings("resource")
    void Withdraw(long debitCard, int CVV) {
        System.out.print("Enter amount to withdraw:");
        Scanner sc = new Scanner(System.in);
        double amt = sc.nextDouble();
        if (amt > balance) {
            System.out.println("Insufficient Balance!");
        } else {
            balance -= amt;
            System.out.println("Amount of" + amt
                    + "withdrawn successfully through your Debit Card!..............\nRemaining Balance : " + balance);
        }
    }

    @SuppressWarnings("resource")
    void Withdraw(long CreditCard) {
        System.out.print("Enter amount to withdraw:");
        Scanner sc = new Scanner(System.in);
        double amt = sc.nextDouble();
        if (amt > balance) {
            System.out.println("Insufficient Balance!");
        } else {
            balance -= amt;
            System.out.println("Amount of " + amt
                    + " withdrawn successfully through your Credit Card!..............\n Ramaining Balance : "
                    + balance);
        }
    }

    @SuppressWarnings("resource")
    void Withdraw(String ID, String Password) {
        System.out.print("Enter amount to withdraw :");
        Scanner sc = new Scanner(System.in);
        double amt = sc.nextDouble();
        if (amt > balance) {
            System.out.println("Insufficient Balance!");
        } else {
            balance -= amt;
            System.out.println(ID + ".. Amount of " + amt
                    + " withdrawn successfully through Net Banking!.............. \nRamaining Balance : " + balance);
        }
    }

}

public class Banking_Method_Overloading {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Bank obj1 = new Bank();
        int choice;
        Scanner scan = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter the Method through which you want to Withdraw money");
            System.out.println(
                    "Press 1 for Debit Card \n Press 2 for Credit card \n Press 3 for Net banking \n Press 4 for Exit");
            System.out.print("Enter the choice : ");
            choice = scan.nextInt();
            switch (choice) {
                case 1: {
                    System.out.print("Enter the Debit Card Number : ");
                    long cardno = scan.nextLong();
                    System.out.print("Enter CVV : ");
                    int cvv = scan.nextInt();
                    obj1.Withdraw(cardno, cvv);
                }
                    break;
                case 2: {
                    System.out.print("Enter the Credit Card Number : ");
                    long cardno = scan.nextLong();
                    obj1.Withdraw(cardno);
                }
                    break;
                case 3: {
                    System.out.print("Enter your Net Banking ID : ");
                    String ID = sc.nextLine();
                    System.out.print("Enter Password : ");
                    String Password = sc.nextLine();
                    obj1.Withdraw(ID, Password);
                }
                    break;
                case 4: {
                    System.out.println("Thanks for Visiting our Portal..\n Visit Again..");
                }
                default: {
                    System.out.println("Invalid Choice!");
                    break;
                }
            }
        } while (choice != 4);

    }
}
