abstract class Animal{
    public abstract void sound();
    public abstract void eat();
}

class Dog extends Animal{
    @Override
    public void sound(){
        System.out.println("Dog is Barking.....");
    }
    @Override
    public void eat(){
        System.out.println("Dog is eating the biscuits.....");
    }

}

class Lion extends Animal{
    @Override
    public void sound(){
        System.out.println("Lion is Roaring........");
    }  
    @Override
    public void eat() {
        System.out.println("Lion is eating Flesh.......");
    }
} 

public class Abstraction {
    public static void main(String[] args) {

        // Creating object of Dog Class usfng the reference of Animal Class
        Animal sparky = new Dog();
        sparky.eat();
        sparky.sound();

        // creating object of Lion Class using the reference of Animal Class
        Animal Simba = new Lion();
        Simba.eat();
        Simba.sound(); 
    }
    
}
