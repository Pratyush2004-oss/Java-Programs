class Thread1 extends Thread {

    private int id = 1500;

    public void run() {
        int i = 0;
        while (i<3000) {
            System.out.println("Thread " + id + " is running");
            i++;
        }
    }
}

class Thread2 extends Thread {
    private int id = 1700;

    public void run () {
        int i = 0;
        while (i<3000) {
            System.out.println("Thread " + id + " is running");
            i++;
        }
    }

}

public class Multi_Threading {
    public static void main(String[] args) {
        // creating objects of threads
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        // starting the thread 1
        t1.start();
        // starting the thread 2
        t2.start();

    }
}
