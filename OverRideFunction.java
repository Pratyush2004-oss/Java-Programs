

class A{
    public void meth1(){
        System.out.println("Method-1 of class-A(Parent class) is Called");
    }
    public void meth2(){
        System.out.println("Method-2 of class-A(Parent Class) is Called");
    }
}

class B extends A{
    
    @Override
    public void meth1(){
        // super.meth1();      //Calling the method of super class 
        System.out.println("Method-1 of class-B (Child class) is Called");
    }
    @Override
    public void meth2(){
        System.out.println("Method-2 of class-B (Child class) is Called");
    }
    public void meth3(){
        System.out.println("Method-3 of class-B (Child class) is Called");
    }
}

public class OverRideFunction {
    public static void main(String[] args) {
        // Creating Objects of Classes A and B
        // A obj_a = new A();
        // obj_a.meth1();
        // obj_a.meth2();

        B obj_b = new B();
        obj_b.meth1();
        obj_b.meth2();
        obj_b.meth3();

    }
}
