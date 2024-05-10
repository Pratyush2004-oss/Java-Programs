import java.util.Scanner;

public class LeapYear {
    
    static int isLeapYear(int y) {
        if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) {
            return 1;
        }
        return 0;
        
    }
    
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a year : ");
        int year = scan.nextInt();
        if (isLeapYear(year) == 1) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }
}
