package Exception_Handling;

import java.util.Scanner;

public class Nested_Exception_Handling_Under_Array {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        int [] marks = new int[6];
        marks[0] = 89;
        marks[1] = 50;
        marks[2] = 80;
        marks[3] = 75;
        marks[4] = 95;
        marks[5] = 77;

        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while(flag){
            System.out.print("Enter the index of element to be accessed:");
            int index = sc.nextInt();
            try{
                System.out.println("Marks in the index " + index + " is " + marks[index]);
                flag = false;
                
            } catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Error! Index is out of bounds.");
            }
        }
        System.out.println("***********************  End of Porgram  *******************");

    }
}
