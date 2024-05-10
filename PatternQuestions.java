import java.util.Scanner;

public class PatternQuestions {

    static void Forward_Triangle(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of rows for pattern 1 : ");
        int size = scan.nextInt();
        // Pattern 1
        System.out.println("\nPattern 1:\n");
        for (int i = 0; i < size; i++) {
            for (int j = size - 1; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.print("Enter the Size of the pattern 2 : ");
        size = scan.nextInt();
        System.out.println("\n Pattern 2 \n");
        Forward_Triangle(size);
    }
}
