package Exception_Handling;

import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString(){
        return "This is my exception \t I am a toString() Method";
    }
    @Override
    public String getMessage(){
        return super.getMessage() + "I am a getMessage() Method"; //To change body of generated methods, choose Tools | Templates.
    }

}

public class Using_Exception_Class {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();
        if(num1 < 50){
            try {
                throw new MyException();
            } catch (Exception e) {
                System.out.println(e.toString());
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }
        
    }
}
