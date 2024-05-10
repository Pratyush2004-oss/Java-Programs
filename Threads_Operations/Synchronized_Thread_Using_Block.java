class A {
    public void show(String name) {
        for (int i=0;i<3;i++){
            System.out.println("A");
        }
        synchronized(this){
            for(int i=0;i<6;i++){
                System.out.println(name + "....... How are you??");
            }
        }
        for (int i=0;i<3;i++){
            System.out.println("B");
        }
    }
} 
class OurThread extends Thread{
    A a = new A();          // It has 1 block
    String name;
    OurThread(A a,String name){
        this.a = a;
        this.name = name;
    }
    public void run(){
        a.show(name);
    }

}

public class Synchronized_Thread_Using_Block {
    public static void main(String[] args) {
        A obj = new A();
        OurThread T1 = new OurThread(obj, "Dean");
        OurThread T2 = new OurThread(obj, "Seth");
      
        T1.start();       // T1 will print first as it is in the beginning of the code
        T2.start();
    }
}
