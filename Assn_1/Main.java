import java.util.Scanner;

// In this code we are exploring the basics of Java by building a Calculator class and a Main class which is used to run the functions.

class Calculator {
    private double memory;

    public Calculator() {
        memory = 0.0;
    }

    public double add(double a, double b) {
        memory = a + b;
        return memory;
    }

    public double sub(double a, double b) {
        memory = a - b;
        return memory;
    }

    public double mul(double a, double b) {
        memory = a * b;
        return memory;
    }

    public double div(double a, double b) {
        if (b == 0) {
            System.out.println("Error: division by zero");
            return Double.NaN;
        } else {
            memory = a / b;
            return memory;
        }
    }

    public double sqrt(double a) {
        if (a < 0) {
            System.out.println("Error: square root of negative number");
            return Double.NaN;
        } else {
            memory = Math.sqrt(a);
            return memory;
        }
    }

    public double power(double a, double b) {
        memory = Math.pow(a, b);
        return memory;
    }

    public double mean() {
        Scanner input = new Scanner(System.in);
        double sum = 0.0;
        int count = 0;
        double num;

        System.out.print("Enter a number or 'end' to stop: ");
        while (input.hasNextDouble()) {
            num = input.nextDouble();
            sum += num;
            count++;
            System.out.print("Enter a number or 'end' to stop: ");
        }

        if (count == 0) {
            System.out.println("Error: no numbers entered");
            return Double.NaN;
        } else {
            memory = sum / count;
            return memory;
        }
    }

    public double variance() {
        Scanner input = new Scanner(System.in);
        double sum = 0.0;
        double squareSum = 0.0;
        int count = 0;
        double num;

        System.out.print("Enter a number or 'end' to stop: ");
        while (input.hasNextDouble()) {
            num = input.nextDouble();
            sum += num;
            squareSum += num * num;
            count++;
            System.out.print("Enter a number or 'end' to stop: ");
        }

        if (count == 0) {
            System.out.println("Error: no numbers entered");
            return Double.NaN;
        } else {
            double mean = sum / count;
            memory = squareSum / count - mean * mean;
            return memory;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner input = new Scanner(System.in);
        String choice;
        double a, b;

        do {
            System.out.println("Calculator Menu");
            System.out.println("---------------");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Square Root");
            System.out.println("6. Power");
            System.out.println("7. Mean");
            System.out.println("8. Variance");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = input.next();

            switch (choice) {
                case "1":
                System.out.print("Enter two numbers: ");
                a = input.nextDouble();
                b = input.nextDouble();
                System.out.println("Result: " + calc.add(a, b));
                break;

            case "2":
                System.out.print("Enter two numbers: ");
                a = input.nextDouble();
                b = input.nextDouble();
                System.out.println("Result: " + calc.sub(a, b));
                break;

            case "3":
                System.out.print("Enter two numbers: ");
                a = input.nextDouble();
                b = input.nextDouble();
                System.out.println("Result: " + calc.mul(a, b));
                break;

            case "4":
                System.out.print("Enter two numbers: ");
                a = input.nextDouble();
                b = input.nextDouble();
                System.out.println("Result: " + calc.div(a, b));
                break;

            case "5":
                System.out.print("Enter a number: ");
                a = input.nextDouble();
                System.out.println("Result: " + calc.sqrt(a));
                break;

            case "6":
                System.out.print("Enter two numbers: ");
                a = input.nextDouble();
                b = input.nextDouble();
                System.out.println("Result: " + calc.power(a, b));
                break;

            case "7":
                System.out.println("Result: " + calc.mean());
                break;

            case "8":
                System.out.println("Result: " + calc.variance());
                break;

            case "0":
                System.out.println("Program Terminating!");
                break;

            default:
                System.out.println("Error: invalid choice");
                break;
            }
        } while (!choice.equals("0"));
    }
}


