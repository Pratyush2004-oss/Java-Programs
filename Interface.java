/*
 * Interface is similar and advanced version of the abstract class 
 * Here all the methods are static, abstract  and public by default
 * Here the variables which are created were final(can not change the value of the variables), static and public
 * only reference can be created for the interface but object can only be created of the class
 * if interface is implemented to a class, then methods are set to be public in the class block
 * all the methods are to be set in the class which are declared in the interface which are implemented 
 */
interface  TV_Remote{
    int val = 59;
    void work();
}

interface Smart_TV_Remote extends TV_Remote{
    void functionality();    
}

class SamSung implements Smart_TV_Remote{
    public void work(){
        System.out.println("SamSung Remote is working");
    }
    public void functionality(){
        System.out.println("SamSung Remote: Functionality of Samsung Smart TV");
    }
}

public class Interface {
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        Smart_TV_Remote S1 = new SamSung();
        System.out.println(S1.val);
        S1.work();
        S1.functionality();

        
    }
    
}
