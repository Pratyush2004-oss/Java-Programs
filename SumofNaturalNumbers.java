import java.util.Scanner;

public class SumofNaturalNumbers {

    static double sum(int n){
        double sum = 0;
        for (int i=1;i<=n;i++){
            sum += i;
        }
        
        return sum;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to sum: ");
        int n = scan.nextInt();
        System.out.println("Sum of first n natural numbers be : " + sum(n));
        
    }
}
