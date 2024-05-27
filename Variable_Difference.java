public class Variable_Difference {

    int a = 28;         // Instance variable
    static double b = 67.5d;        // Static variable

    public static void main(String[] args) {
        Boolean c = true;
        // accessing the local varaible by just giving the name of the variable
        System.out.println(c);

        // cannot access the instabce variable diractly Creating the object of the to access the variable 
        Variable_Difference v1 = new Variable_Difference();   // Object of the class
        System.out.println(v1.a);

        // as variable is static so can easily be accessed even without creating the object
        System.out.println(b);
    }
    
}
