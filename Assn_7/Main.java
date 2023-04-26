package Assn_7;

public class Main {
    public static void main(String[] args) {
        // Command Line creation of Rational number
        try {
            if (args.length == 4) {
                int a = Integer.parseInt(args[0]);
                int b = Integer.parseInt(args[1]);
                int c = Integer.parseInt(args[2]);
                int d = Integer.parseInt(args[3]);
                RationalNumber rn1 = new RationalNumber(a, b);
                RationalNumber rn2 = new RationalNumber(c, d);
                System.out.println("Rational Numbers from CLA: ");
                System.out.println(rn1);
                System.out.println(rn2);
                System.out.println("Performing All Operations");
                System.out.println("Addition");
                System.out.println(rn1.add(rn2));
                System.out.println("Subtraction");
                System.out.println(rn1.subtract(rn2));
                System.out.println("Multiplication");
                System.out.println(rn1.multiply(rn2));
                System.out.println("Division");
                System.out.println(rn1.divide(rn2));
                System.out.println("Absolute Values");
                System.out.println(rn1.abs());
                System.out.println(rn2.abs());
                System.out.println("Float Values");
                System.out.println(rn1.floatValue());
                System.out.println(rn2.floatValue());
            }
        } catch (NumberFormatException ne) {
            System.out.println("Invalid Arguments for RationalNumber. Expected (int, int)");
        } catch (ArithmeticException ae) {
            System.out.println(ae.getMessage());
        }
    }
}
