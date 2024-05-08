

class A extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 7; i++) {
                System.out.println("Thread A : " + i);
                Thread.sleep(1500);
            }
            System.out.println("Thread A is Running .........");
        } catch (InterruptedException i) {
            System.out.println("Interrupting Exception Caught in Thread A .....");
        }
    }
}

public class Thread_Using_Interrupt {
    public static void main(String[] args) {
        // Creating Object of Class A which extends the Thread class
        A obj = new A();
        // Starting the thread using start() method
        obj.start();
    }

}
