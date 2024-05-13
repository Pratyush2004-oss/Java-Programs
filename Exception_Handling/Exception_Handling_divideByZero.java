
package Exception_Handling;

import java.util.Scanner;

public class Exception_Handling_divideByZero{
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numerator:");
        int a = sc.nextInt();
        System.out.println("Enter the denominator:");
        int b = sc.nextInt();
        try {
            int c = a/b;
            System.out.println("the result is " + c);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("An error occurred division by zero is not allowed.. Reason: " + e);
        } 
    }
}