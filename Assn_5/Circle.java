package Assn_5;

public class Circle implements Shape {
    float radius;
    double area;
    double perimeter;

    Circle(int radius) {
        this.radius = radius;
    }

    public void calculateArea() {
        this.area = Math.PI * Math.pow(radius, 2);
    }

    public void calculatePerimeter() {
        this.perimeter = 2 * Math.PI * this.radius;
    }

    public String toString() {
        return "Area: " + this.area + " Perimeter: " + this.perimeter;
    }
}
