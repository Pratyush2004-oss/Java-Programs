package Exception_Handling;

import java.util.*;

public class Specific_Exception_Handling {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 45;
        marks[1] = 81;
        marks[2] = 75;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the index of element to be accessed :");
        int index = sc.nextInt();

        System.out.print("Enter the number you want to divide with : ");
        int num = sc.nextInt();
        try {
            System.out.println("The value at array index entered is : " + marks[index]);
            System.out.println("The value of the number is : " + marks[index] / num);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array out of bound exception occured.....");
        } 
        catch (ArithmeticException e) {
            System.out.println("Arithmatic exception occured.....division by zero.....");
        }
        catch (Exception e) {
            System.out.println("Some other exception occured.....");
        }

    }
}
