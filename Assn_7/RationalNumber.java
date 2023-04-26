package Assn_7;

public class RationalNumber extends Main {
    private final int a;
    private final int b;

    RationalNumber(int a, int b) throws ArithmeticException {
        // constructor
        if (b == 0) {
            throw new ArithmeticException("Denominator cannot be 0 for rational number.");
        }
        this.a = a;
        this.b = b;
    }

    public RationalNumber add(RationalNumber rn) {
        // Add two rational numbers
        return new RationalNumber(this.a * rn.b + this.b * rn.a, this.b * rn.b);
    }

    public RationalNumber subtract(RationalNumber rn) {
        // Subtract two rational numbers
        return new RationalNumber(this.a * rn.b - this.b * rn.a, this.b * rn.b);
    }

    public RationalNumber multiply(RationalNumber rn) {
        // Multiply two rational numbers
        return new RationalNumber(this.a * rn.a, this.b * rn.b);
    }

    public RationalNumber divide(RationalNumber rn) {
        // Divide two rational numbers
        return new RationalNumber(this.a * rn.b, this.b * rn.a);
    }

    public RationalNumber abs() {
        return new RationalNumber(Math.abs(this.a), Math.abs(this.b));
    }

    public double floatValue() {
        return (double) this.a / this.b;
    }

    @Override
    public String toString() {
        return "RationalNumber: " + this.a + "/" + this.b;
    }
}
