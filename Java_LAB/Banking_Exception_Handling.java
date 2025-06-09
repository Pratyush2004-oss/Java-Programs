package Java_LAB;
import java.util.*;
class MinimiumBalance extends Exception {
    public MinimiumBalance(String msg) {
        System.out.println(msg);
    }
}
class MaxTransaction extends Exception {

    public MaxTransaction(String msg) {
        System.out.println(msg);
    }
}
class InsufficientFunds extends Exception {
    public InsufficientFunds(String msg) {
        System.out.println(msg);
    }
}
class MaxBalanceTransaction extends Exception {
    public MaxBalanceTransaction(String msg) {
        System.out.println(msg);
    }
}
public class Banking_Exception_Handling {
    public static void main(String[] args) {
        double balance = 150000.0d;
        int limit = 0;
        try {
            Transaction(balance, limit);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    @SuppressWarnings("resource")
    public static void Transaction( double balance, int limit) {
        Scanner sc = new Scanner(System.in);
        try {
            while (limit <= 3) {
                System.out.print("Enter the Amount to be Withdrawn : ");
                double amount = sc.nextDouble();
                if (balance < 1000) {
                    try {
                        throw new MinimiumBalance("Minimum Balance is $1000");
                    } catch (MinimiumBalance e) {
                        // TODO Auto-generated catch block
                        // e.printStackTrace();
                    }
                } else if (amount > 100000) {
                    try {
                        throw new MaxTransaction("Amount should be less than $100000");
                    } catch (MaxTransaction e) {
                        // TODO Auto-generated catch block
                        // e.printStackTrace();
                    }
                } else if (amount > balance) {
                    try {
                        throw new InsufficientFunds("Insufficient Funds!");
                    } catch (Exception e) {
                        // TODO: handle exception
                    }
                } else if (amount < 0) {
                    System.out.println("Invalid Amount! Please enter a positive number.");
                }
                else{
                    System.out.println("Amount of " + amount + "withdrawn from the account...");
                    balance -= amount;
                    System.out.println("Your current balance is :" + balance);
                }
                limit++;
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
