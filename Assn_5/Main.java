package Assn_5;

public class Main {
    public static void main(String[] args) {
        System.out.println("Circle: ");
        Circle c = new Circle(10);
        c.calculateArea();
        c.calculatePerimeter();
        System.out.println(c);
        System.out.println("Square: ");
        Square s = new Square(10);
        s.calculateArea();
        s.calculatePerimeter();
        System.out.println(s);
        System.out.println("Triangle: ");
        Triangle t = new Triangle(10, 20, 30);
        t.calculateArea();
        t.calculatePerimeter();
        System.out.println(t);
    }
}
