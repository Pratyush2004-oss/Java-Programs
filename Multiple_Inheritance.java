interface A{
    void show();
}
interface B{
    void show();
}

public class Multiple_Inheritance implements A,B {

    public void show(){
        System.out.println("This is the implementation of show() of main class method.");
    }
    public static void main(String[] args) {
        Multiple_Inheritance obj = new Multiple_Inheritance();
        obj.show();
        
    }
}
