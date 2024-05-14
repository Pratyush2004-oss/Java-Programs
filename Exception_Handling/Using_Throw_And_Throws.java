package Exception_Handling;

import java.util.Scanner;

class Negativedimension extends Exception{
    @Override
    public String toString(){
        return "Radius can not be negative";
    }
    @Override
    public String getMessage(){
        return "Radius can not be negative";
    }

}

public class Using_Throw_And_Throws {

    // Function created to calculate the area
    public static double area(double r) throws Negativedimension{
        if (r < 0){
            throw new Negativedimension();
        }
        double area = Math.PI * r * r;
        return area;

    }
    // Function created by the user
    public static int divide(int a, int b) throws ArithmeticException{
        int result = a/b;
        return result;
    }
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        // Function used by another user to divide the numbers 
        try {
            int c = divide(6, 0);
            System.out.println(c);
        } catch (Exception e) {
            System.out.println("Exception...... \nDivide by zero is not a valid case.....");
        }

        // Function used bt another user to calculete the area of circle
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of radius : ");
        double radius = sc.nextDouble();
        try {
            double area = area(radius);
            System.out.println("Area of Circle with radius " + radius + " is : " + area);
        } catch (Negativedimension e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
