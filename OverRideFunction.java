

class A{
    public void meth1(){
        System.out.println("Method-1 of class-A is Called");
    }
    public void meth2(){
        System.out.println("Method-2 of class-A is Called");
    }
}

class B extends A{
    @Override
    public void meth1(){
        System.out.println("Method-1 of class-B is Called");
    }
    @Override
    public void meth2(){
        System.out.println("Method-2 of class-B is Called");
    }
    public void meth3(){
        System.out.println("Method-3 of class-B is Called");
    }
}

public class OverRideFunction {
    public static void main(String[] args) {
        // Creating Objects of Classes A and B
        A obj_a = new A();
        obj_a.meth1();

        B obj_b = new B();
        obj_b.meth3();

    }
}
