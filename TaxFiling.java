import java.util.Scanner;

public class TaxFiling {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        // Create a new instance of the TaxFiling class.
        double taxpaid;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the income of the employee : ");
        double income = scan.nextDouble();

        if(income >= 250000 && income < 500000){
            taxpaid = income*5/100;
            System.out.println("Tax Paid by the Employee : " + taxpaid);
        }
        else if(income >= 500000 && income < 1000000){
            taxpaid = income*20/100;
            System.out.printf("The amount paid as tax is : " + taxpaid);
        }
        else if(income >= 1000000){
            taxpaid = income*30/100;
            System.out.println("Tax paid by the employee is : " + taxpaid);
        }
        else if(income < 250000){
            System.out.println("No tax to be paid....");
        }
    }
}
