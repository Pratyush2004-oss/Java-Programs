package Java_LAB;

import java.util.Scanner;

class A {
    @SuppressWarnings("resource")
    void arrayInputSum() {
        System.out.print("Enter the size of the array : ");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the Element in index " + i + " : ");
            arr[i] = scan.nextInt();
        }
        for (int i : arr) {
            System.out.print(i + "\t");
        }

        // Sum of both even and odd terms saperately
        int oddsum = 0, evensum = 0;
        for (int i : arr) {
            if (i % 2 == 0) {
                evensum += i;
            } else {
                oddsum += i;
            }
        }
        System.out.println("\nSum of even terms of the array is : " + evensum);
        System.out.println("Sum of the odd terms of the array is : " + oddsum);
    }
}

public class Odd_Even_Array {
    public static void main(String[] args) {
        A aa = new A();
        aa.arrayInputSum();
    }
}
