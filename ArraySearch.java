import java.util.Scanner;

public class ArraySearch {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int [] arr = new int[size];
        int i,count = 0;
        for (i=0;i<size;i++){
            System.out.print("Enter the " + i + " element : ");
            arr[i] = scan.nextInt();
        }
        System.out.print("Enter the number to be Searched : ");
        int key = scan.nextInt();

        for (i=0;i<size;i++){
            if(arr[i] == key){
                System.out.println("Element is found at index: " + i);
                count = 1;
            }
            else{
                continue;
            }
        }
        if(count == 0){
            System.out.println("Element not found");
        }

    }
}
