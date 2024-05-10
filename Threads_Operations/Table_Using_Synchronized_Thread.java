class Table {
    public synchronized void display(int n){
        for(int i=1;i<=10;i++){
            System.out.println(n + " * " + i + " = " + (n*i));
        }
    }
}

class Table1 extends Thread{
    Table T;
    Table1(Table T){
        this.T = T;
    }
    public void run(){
        T.display(5);
    }
}
class Table2 extends Thread{
    Table T;
    Table2(Table T){
        this.T = T;
    }
    public void run(){
        T.display(7);
    }
}

public class Table_Using_Synchronized_Thread {
    public static void main(String[] args) {
        
        //Table using Synchronization in Threads
        Table obj = new Table();
        
        Table1 t1 = new Table1(obj);
        Table2 t2 = new Table2(obj);
        
        t1.start();
        t2.start();
    }
}
