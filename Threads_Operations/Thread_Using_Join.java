

class A extends Thread {
    public void run() {
        String n = Thread.currentThread().getName();
        for (int i = 0; i < 5; i++) {
            System.out.println("Name: " + n + ", Value: " + (i + 1));
        }
    }
}

public class Thread_Using_Join {
    public static void main(String[] args) {
        A t1 = new A();
        A t2 = new A();
        A t3 = new A();

        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");

        t2.start();
        try {
            t2.join();
        } catch (InterruptedException i) {
            // TODO: handle exception
        }
        t1.start();
        t3.start();
    }
}
