class Parent{
    int a = 10;
    int b = 78;
    void sum(){
        System.out.println("Sum of "+a+" and "+b+ " is :"+ (a + b));
    }
}
class Child extends Parent {
    int a = 89;
    int b = 87;
    void sum(){
        System.out.println("Sum of " + a + " and " +  b + " is : " + (a+b));
        super.sum(); // calling the parent's method
    }
}
public class Using_SuperKeeyword {
    public static void main(String[] args) {
        
        //A super keyword is used to invoke the methods of a parent class from within a child class.
        Child ch = new Child();
        ch.sum();
    }

}
