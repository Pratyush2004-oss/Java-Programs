interface A{
    void show();
}
interface B{
    void show();
}

public class Multiple_Inheritance implements A,B {

    public void show(){
        System.out.println("This is the implementation of show() method.");
    }
    public static void main(String[] args) {
        
    }
}
