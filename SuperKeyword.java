class Base{
    Base(){
        System.out.println("I am a constructor of base class without any parameters");
    }
    Base(int a){
        System.out.println("I am an overloaded constructor of Base class with parameters : " + a);
    }
    Base(int a, int b){
        System.out.println("I am an overloaded constructor of Base class with parameters : " + a + " and " + b);
    }
}

class Derived extends Base{
    Derived(){
        // super keyword is used to call the parameterized method. Method was called according to the parameters passed 
        // super();     
        // super(17);
        super(45, 78);
        System.out.println("I am a constructor of the derived class ");
    }
}

public class SuperKeyword {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Derived d = new Derived();
    }
}
