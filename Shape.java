import java.util.*;
@SuppressWarnings("resource")
class Circle{
    double radius, area;
    double SetRadius(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of radius : ");
        this.radius = sc.nextDouble();
        return radius;
    }
    double getArea(){
        area = 3.14 * radius * radius;
        System.out.println("The Area of the circle is : " + area);
        return area;
    }
}

@SuppressWarnings("resource")
class Cylinder extends Circle{
    private double height,volume;
    double getHeight(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of Height :");
        this.height = sc.nextDouble();
        return height;
    }
    double getVolume(){
        volume = 3.14 * radius * (radius+height) ;
        System.out.println("Volume of the cylnder is : " + volume);
        return volume;
    }
}

public class Shape {
    public static void main(String[] args) {
        Circle c = new Circle();
        //Circle
        c.SetRadius();
        c.getArea();
        
        //Cylinder
        Cylinder cy = new Cylinder();
        System.out.println("\nDetails of Cylinder:");
        cy.SetRadius();
        cy.getHeight();
        cy.getVolume();
        
    }
}
