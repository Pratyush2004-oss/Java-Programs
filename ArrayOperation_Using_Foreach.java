import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperation_Using_Foreach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int size = sc.nextInt();
        int [] arr = new int[size];

        for (int i =0; i<size;i++){
            System.out.print("Enter element at index "+i+": ");  
            arr[i] = sc.nextInt();
        }

        for (int i : arr) {
            System.out.print(i + "\t"); 
        }   
        
        // Sorting the array
        Arrays.sort(arr);

        System.out.println("\nSorted array is : " );
        for (int i : arr) {
            System.out.print(i + "\t");
        }    
    }
}
