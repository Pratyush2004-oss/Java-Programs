package Java_LAB;

abstract class Shape {
    abstract void area(int x, int y);
    abstract void area(int r);
}

class Rectangle extends Shape {
    void area(int x, int y) {
        System.out.println("Area of rectangle is: " + (double) (x * y));
    }
    void area(int r){}
}

class Triangle extends Shape {
    void area(int x, int y) {
        System.out.println("Area of triangle is: " + ((double) (x * y) / 2));
    }
    void area(int r){}
}

class Circle extends Shape{
    @Override
    void area(int x, int y) {}
    void area (int r){
        double res = Math.PI * (double) r * (double) r;
        System.out.printf("Area of circle is: %.2f",res);
    }
}

public class Area_Of_Different_Shapes {
    public static void main(String[] args) throws Exception {
        try{
            Rectangle R1 = new Rectangle();
            R1.area(5, 7);
            Triangle T1 = new Triangle();
            T1.area(5, 45);
            Circle C1 = new Circle();
            C1.area(60);
        }
        catch(Exception e){
            System.out.println("Exception occured.......");
        }
    }

}
