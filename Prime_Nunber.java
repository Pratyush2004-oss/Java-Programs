public class Prime_Nunber {
    public static void main(String[] args) {
        int i, j;
        for (i = 2; i <= 100; i++) {
            boolean isPrime = true;
            /* check from 2 to i-1 */
            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break; // exit inner loop
                }
            }
            /* print prime number */
            if (isPrime) {
                System.out.print(i + "\t");
            }
        }
    }
}
