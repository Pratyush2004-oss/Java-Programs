
class MyThr extends Thread{
    public MyThr(){
        super("MyThread");
    }
    public void run(){
        System.out.println("I am a Thread 1");
    }
}
class MyThr2 extends Thread{
    public MyThr2(){
        super("MyThread");
    }
    public void run(){
        System.out.println("I am a Thread 2");
    }
}

public class Thread_Constructor {
    public static void main(String[] args) {
        MyThr t1 = new MyThr();
        t1.start();
        // System.out.println("The id of the thread is "+ t1.getId());
        System.out.println("Name of the thread is : " + t1.getName());
        
        MyThr t2 = new MyThr();
        t2.start();
        // System.out.println("The id of the thread is "+ t2.getId());
        System.out.println("Name of the thread is : " + t2.getName());
    }
}
