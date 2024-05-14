package Java_LAB;

import java.util.Scanner;

class Prime {
    Prime(int a, int b) {
        for (int i = a; i <= b; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + "\t");
            }
        }
    }
}

public class Prime_Number_between_Range {
    @SuppressWarnings({ "unused", "resource" })
    public static void main(String[] args) {
        int a, b;
        System.out.println("********  Enter the range from where you want to print Prime Numbers  *********");
        Scanner sc = new Scanner(System.in);
        System.out.print("Start : ");
        a = sc.nextInt();
        System.out.print("End : ");
        b = sc.nextInt();

        Prime P = new Prime(a, b);

    }
}
