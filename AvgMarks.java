import java.util.Scanner;

public class AvgMarks {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of Students appeared for Examination : ");
        int students = scan.nextInt();
        int [] arr = new int[students];
        float sum=0,avg;
        System.out.println("\n Enter Marks of each Student (Out of 100):-");
        for(int i=0;i<students;i++){
            System.out.print("Student " + (i+1)+" Marks: ");
            arr[i] = scan.nextInt();
        }

        for (int i =0 ;i< students;i++){
            sum += arr[i];
        }
        avg = sum/students;
        System.out.println("Average marks in Physics is : " + avg);
    }
}
