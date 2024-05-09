class A extends Thread{
    public void run(){
        try {
            String name = Thread.currentThread().getName();
            for (int i=0;i<5;i++){
                System.out.println(name + " with value : " + i);
                System.out.println("PRIORITY : " + Thread.currentThread().getPriority());
                Thread.sleep(1500);
            }
        } catch (InterruptedException i) {
            // TODO: handle exception
        }
    }
}

public class Thread_Priority {
    public static void main(String[] args) {
        A t1 = new A();
        A t2 = new A();        
        A t3 = new A();
        /* Set priority to the thread */
        t1.setName("Thread 1");
        t1.setPriority(4);
        t2.setName("Thread 2");
        t2.setPriority(6);
        t3.setName("Thread 3");
        t3.setPriority(2);
        /* Start all threads */
        t1.start();
        t2.start();
        t3.start();

        System.out.println();

        
    }
}
