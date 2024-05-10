import java.util.Scanner;

public class SumOfTable {

    static int sumOfTable(int n){
        int sum = 0;
        for (int i=1;i<=10;i++){
            sum += i*n;
        }
        return sum;
    }
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number whose sum of table is to be printed : ");
        int num = scan.nextInt();
        System.out.println("Sum of the table is: " + sumOfTable(num));
    }
}
