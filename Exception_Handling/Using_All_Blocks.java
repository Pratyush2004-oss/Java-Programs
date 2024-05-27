package Exception_Handling;

public class Using_All_Blocks {
    public static void main(String[] args) {
        try {
            System.out.println("Learn Coding..... ");
            int a=10,b=0,c;
            c=a/b;
            System.out.println(c);
            System.out.println("Program done..... ");   
        } catch (ArithmeticException e) {
            // TODO: handle exception
            System.out.println("Error : Division by zero is not allowed");
        }
        finally{
            System.out.println("This block executes irrespective of an exception occurs or not");
        }
        System.out.println("Main method ended");
    }
}
