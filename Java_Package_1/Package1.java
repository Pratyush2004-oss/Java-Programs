package Java_Package_1;

public class Package1 {
    public void show(){
        System.out.println("This is a method in the first package");
    }
    public static void main(String[] args) {
        //accessing private variable from another package
        Package1 p = new Package1();
        p.show();
    }
    
}
