package Assn_5;

public class Square {
    float side;
    double area;
    double perimeter;

    Square(float side) {
        this.side = side;
    }

    public void calculateArea() {
        this.area = Math.pow(this.side, 2);
    }

    public void calculatePerimeter() {
        this.perimeter = this.side * 4;
    }

    public String toString() {
        return "Area: " + this.area + " Perimeter: " + this.perimeter;
    }
}
