/**
 * MultiThreading_Synchronization
 */

class Bank extends Thread {
    static int Balance = 15000;
    static int withdraw;

    @SuppressWarnings("static-access")
    Bank(int withdraw) {
        this.withdraw = withdraw;
    }

    public static synchronized void Withdraw() {     // t1, t2, t3, t4
        String name = Thread.currentThread().getName();
        if (withdraw <= Balance) {
            System.out.println("Transaction Successful by " + name + "......... Amount : " + withdraw);
            Balance -= withdraw;
            System.out.println("Remaining Balance : " + Balance);
        } else {
            System.out.println("Insufficient balance in your account");
        }
    }
    
    public void run(){
        try {
            Withdraw();
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            // TODO: handle exception
        }
    }

}

public class MultiThreading_Synchronization {       //Bank class will have 1 lock
    public static void main(String[] args) {

        Bank obj = new Bank(5000);      //obj has 1 lock
        Bank obj1 = new Bank(4000);     //obj1 has a different lock, but same class so it can access the shared resource

        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj);
        Thread t3 = new Thread(obj1);
        Thread t4 = new Thread(obj1);
        
        

        t1.setName("Dean");
        t2.setName("John");
        t3.setName("Becky");
        t4.setName("Seth");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}