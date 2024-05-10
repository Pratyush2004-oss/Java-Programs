import java.util.Scanner;

public class WeekDays {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        
        int choice;
        do{
            Scanner scan = new Scanner(System.in);
            // System.out.println("\n 1) Monday \n 2) Tuesday \n 3) Wednesday \n 4) Thursday \n 5) Friday \n 6) Saturday \n 7) Sunday");
            System.out.print("Enter your choice : ");
            choice = scan.nextInt();
            switch (choice) {
                case 1: System.out.println("Monday");
                break;
                case 2: System.out.println("Tuesday");
                break;
                case 3: System.out.println("Wednesday");
                break;
                case 4: System.out.println("Thursday");
                break;
                case 5: System.out.println("Friday");
                break;
                case 6: System.out.println("Saturday");
                break;
                case 7: System.out.println("Sunday");
                break;
                case 8: System.out.println("EXIT");
                break;
                default: System.out.println("Enter valid choice");
                break;
            }  
        } while(choice!=8);
    }

}
