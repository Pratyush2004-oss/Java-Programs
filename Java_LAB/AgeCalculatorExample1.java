package Java_LAB;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculatorExample1 {
    public static int calculateAge(LocalDate dob) {
        LocalDate curDate = LocalDate.now();
        return Period.between(dob, curDate).getYears();
    }
    public static void main(String[] args) {
        System.out.print("Enter date of birth in YYYY-MM-DD format: ");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        LocalDate dob = LocalDate.parse(input);
        int age = calculateAge(dob);
        System.out.println("You are " + age + " years old.");
    }

}
