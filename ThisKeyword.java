class A{
    A(){
        this(42);
        System.out.println("This is a default constructor in java with no parameters....");
    }
    A(int a){
        // this(); // calling the default constructor
        System.out.println("The value of parameterized constructor is : "+a);
    }
}

public class ThisKeyword{
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        A obj = new A(); 
    }
}