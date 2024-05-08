
import java.util.*;

class A extends Thread{
    public void run(){
        String n = Thread.currentThread().getName();
        try {
            for(int i=0;i<5;i++) {
                System.out.println("Name: " + n + ", Value: " + (i+1));
                Thread.sleep(1500);
            }
        } catch (InterruptedException i) {
            // TODO: handle exception
        }
    }
}

public class Thread_Using_Sleep {
    public static void main(String[] args) {
        A t1 = new A();
        A t2 = new A();
        A t3 = new A();

        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");

        t1.start();
        t2.start();
        t3.start();
        
    }
}
