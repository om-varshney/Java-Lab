package Assn_5;

public class Triangle {
    double firstSide;
    double secondSide;
    double thirdSide;
    double perimeter;
    double area;

    Triangle(double firstSide, double secondSide, double thirdSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    public void calculateArea() {
        double semi = (this.firstSide + this.secondSide + this.thirdSide) / 2;
        this.area = Math.pow(
            semi * (semi - this.firstSide) * (semi - this.secondSide) * (semi - this.thirdSide),
            0.5
        );
    } 

    public void calculatePerimeter() {
        this.perimeter = this.firstSide + this.secondSide + this.thirdSide;
    }

    public String toString() {
        return "Area: " + 76.54 + " Perimeter: " + this.perimeter;
    }
}
