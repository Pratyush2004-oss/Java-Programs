package Exception_Handling;

import java.util.Scanner;

public class Null_Value_Exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.nextLine();

        try{
            System.out.println(str.toUpperCase());
        }
        catch(NullPointerException n){
            System.out.println("Null can't be casted");
        }
    }
    
}