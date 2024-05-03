import java.util.Scanner;

public class Marksheet {
    public static void main(String[] args) {
        float sub1, sub2, sub3;
        Scanner scan = new Scanner(System.in);
    
        System.out.print("Enter marks in subject 1 : ");
        sub1 = scan.nextFloat();
        System.out.print("Enter marks in subject 2 : ");
        sub2 = scan.nextFloat();
        System.out.print("Enter marks in subject 3 : ");
        sub3 = scan.nextFloat();
        float total = (sub1 + sub2 + sub3)/3;
        System.out.println("your overall grade is : " + total);

        // Calculate total and average of the three subjects
        if(sub1 >= 33 && sub2 >= 33 && sub3 >= 33 && (sub1+sub2+sub3)/3 > 40){
            System.out.println("Congratulations, you have passed the examination");
        }
        else{
            System.out.println("Sorry, you are failed.");
        }
    }
}
