class A{
    void show(){
        System.out.println("This is a overloaded function with no parameters......");
    }
    void show(int a){
        System.out.println("This is a overloaded function using single integer paramater......." + a);
    }
    void show(int a, int b){
        System.out.println("This is a overloaded function with 2 parameters..... "+ a + " & "+b);
    }

}

public class PolyMorpjism {
    public static void main(String[] args) {
        A obj = new A();
        // calling the method without any parameter
        obj.show();
        // calling the method using one parameter
        obj.show(50);
        // calling the method using two parameters
        obj.show(10, 70);

        
    }
}
