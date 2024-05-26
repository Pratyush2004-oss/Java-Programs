interface Client{
    void webDesign();
    void webDevelopment();
}

abstract class TechHead1 implements Client{
    public void webDesign(){
        System.out.println("Front-End part is created successfully......");
    }
}

class TechHead2 extends TechHead1{
    public void webDevelopment(){
        System.out.println("Creating Backend, Connection to Backend done successfully....");
    }
}

public class Abstraction_Extended {
    public static void main(String[] args) {
        Client tech = new TechHead2();
        tech.webDesign();
        tech.webDevelopment();
        
    }
}
