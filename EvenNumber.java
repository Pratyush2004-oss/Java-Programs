import java.util.Scanner;

public class EvenNumber {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scan.nextInt();
        int i = 0;
        while ( i <= num){
                System.out.println(i*2);
            i++;
        }
    }
}
