
import java.util.*;

class A extends Thread {
    public void run() {
        String n = Thread.currentThread().getName();
        for(int i=0;i<5;i++) {
            System.out.println("Name: " + n + ", Value: " + (i+1));
        }
    }
}

public class Thread_Using_Suspend_And_Resume {

    public static void main(String[] args) {
        A t1 = new A();
        A t2 = new A();
        A t3 = new A();

        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");

        t1.start();
        t2.start();
        t2.suspend();       // These inbuilt methods of the Thread are now depreacted and marked for removal from the JDK  
        t3.start();
        t2.resume();        // These inbuilt methods of the Thread are now depreacted and marked for removal from the JDK  

    }
}
