import java.util.*;

public class FibonacciSeries {

    static void fibonacci(int n, int n1, int n2) {
        int n3;
        n3 = n1 + n2;
        if(n > 2){
            System.out.print( "\t" + n3);
            fibonacci(n-1, n2, n3);
        }
    }

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of elements to be generated in the series: ");
        int num = scan.nextInt();

        System.out.print("Fibonacci Series : \t" + 0 + "\t" +  1);
        fibonacci(num,0,1);

    }
}
