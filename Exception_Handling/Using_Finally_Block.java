package Exception_Handling;

public class Using_Finally_Block {
    public static int Greet() {
        try {
            int a = 10;
            int b = 7;
            int c = a / b;
            return c;

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Division by zero is not allowed.....");
        } finally {
            System.out.println("Cleaning up the resouces.....\n This is the end of the program.....");
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("The result is : ");
        System.out.println(Greet());

    }
}