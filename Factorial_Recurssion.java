import java.util.Scanner;

public class Factorial_Recurssion {

    static int fact(int n){
        if (n == 0) return 1;
        else return n * fact(n-1);
    } 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        System.out.println("The factorial of " + num + " is " + fact(num));
    }
}
