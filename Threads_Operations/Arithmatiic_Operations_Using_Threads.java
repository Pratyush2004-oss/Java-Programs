
class A extends Thread{
    int n1, n2;
    A(int n1, int n2){
        this.n1 = n1;
        this.n2 = n2;
    }
    public void run(){
        System.out.println("Thread 1: " + (n1+n2));
        System.out.println("Thread 1: " + (n1-n2));
        System.out.println("Thread 1: " + (n1*n2));
        System.out.println("Thread 1: " + (n1/n2));
        

    }
}
public class Arithmatiic_Operations_Using_Threads {
    public static void main(String[] args) {
        A obj1 = new A(50,60);
        A obj2 = new A(-34,-97);
        //starting the threads
        obj1.start();
        obj2.start();

    }
    
}
