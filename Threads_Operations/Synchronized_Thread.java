class Bus implements Runnable{
    int available = 2,passenger;
    Bus(int passenger){
        this.passenger=passenger;       // passenger = 1 and 2
    }
    public synchronized void run(){
        String name = Thread.currentThread().getName();
        if(available >= passenger){
            System.out.println(name + " reserved their " + passenger + " seat");
            available -= passenger;
        }
        else{
            System.out.println("Sorry, Seat not available.....");
        }
    }
}

public class Synchronized_Thread {
    public static void main(String[] args) {
        Bus r = new Bus(1);

        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        Thread t3 = new Thread(r);

        t1.setName("John");
        t2.setName("Jimmy");
        t3.setName("Jey");

        // starting the Threads
        t1.start();
        t2.start();
        t3.start();
    }
}
