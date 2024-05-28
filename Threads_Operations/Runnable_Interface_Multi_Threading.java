class RunnableThread1 implements Runnable{
    public void run(){
        int i=0;
        while(i<3000){
            System.out.println("Thread 1 is running ");
            i++;
        }
    }
}
class RunnableThread2 implements Runnable{
    public void run(){
        int i=0;
        while(i<3000){
            System.out.println("Thread 2 is running ");
            i++;
        }
    }
}

public class Runnable_Interface_Multi_Threading {
    public static void main(String[] args) {
        RunnableThread1 rt1 = new RunnableThread1();
        Thread t1 = new Thread(rt1);
        RunnableThread2 rt2 = new RunnableThread2();
        Thread t2 = new Thread(rt2);
        // Start the threads
        t1.start();
        t2.start();
        
    }
}