import java.util.Scanner;

public class PatternQuestions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of rows for pattern 1 : ");
        int size = scan.nextInt();
        //Pattern 1
        System.out.println("\nPattern 1:\n");
        for(int i = 0; i<size; i++){
            for(int j=size-1; j>=i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }    
}
