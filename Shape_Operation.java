class Square{
    private int sideLength;
    public Square(int side){
        this.sideLength = side;
        System.out.println("Area of the square is : " + (sideLength*sideLength));
        System.out.println("Perimeter of the square is : " + (4*sideLength) + "\n");
    }
}

class Rectangle{
    private double length, breadth;
    public Rectangle(double len, double bre) {
        this.length=len;
        this.breadth = bre;
        System.out.println("Area of the rectangle is: "+(length * breadth));
        System.out.println("Perimeter of the rectangle is: "+(2*(length+breadth)) + "\n");
    }
}

public class Shape_Operation {
    @SuppressWarnings({ "resource", "unused" })
    public static void main(String[] args) {
        // Creating objects of different classes
        Square sq = new Square(5);
        Rectangle rec = new Rectangle(3.0, 4.0);
        
    }
}
