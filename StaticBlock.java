//                       Static Block

public class StaticBlock {
    public static void main(String[] args) {
        // StaticBlock s = new StaticBlock();

    }
    // Instance Block
    {
        System.out.println("Instance Block of Class A");
    }
    // static Block
    static{
        System.out.println("Static block of class A");
    }
    // Constructor Block of the Class
    StaticBlock(){
        System.out.println("Constructor of Class A");
    }
    
}
