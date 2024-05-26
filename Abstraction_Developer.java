abstract class Programmer{
    public abstract void Developer();
}

class C extends Programmer{
    @Override
    public void Developer(){
        System.out.println("The Developer of C is : Dennis Ritchie");
    }
}

class Python extends Programmer{
    @Override
    public void Developer(){
        System.out.println("The Developer of Python is : Guido van Rossum" );
    }
}

class Java extends Programmer{
    @Override
    public void Developer(){
        System.out.println("The Developer of Java is : James Gosling");
    }
}

class HTML extends Programmer{
     @Override
     public void Developer(){
        System.out.println("The Developer of HTML is : Tim Berners Lee");
     }
}


public class Abstraction_Developer {
    public static void main(String[] args) {

        // Creating objects of different classes...
        Programmer james = new Java();
        james.Developer();
        Programmer tim = new HTML();
        tim.Developer();
        Programmer Gudio = new Python();
        Gudio.Developer();  
        Programmer Dennnis = new C();
        Dennnis.Developer();
        // Calling the method using the object reference variable...

        
    }
}