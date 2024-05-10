import java.util.Scanner;

public class IsSorted {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = scan.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the " + i + " element : ");
            arr[i] = scan.nextInt();
        }

        // Printing array
        System.out.print("The given array is: \n");
        for (int i : arr) {
            System.out.print(i + "\t");
        }
        // Is Sorted or not
        int sorted = 1;
        for (int i=0;i<size;i++){
            for (int j=0;j<i;j++){
                if(arr[j] < arr[j+1]){
                    continue;
                }
                else{
                    sorted = 0;
                }
            }
        }

        if(sorted == 0){
            System.out.println("\nThe array is not sorted.");
        }
        else{
            System.out.println("Array is sorted");
        }
    }

}
