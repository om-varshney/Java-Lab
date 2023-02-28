public class Master {
    public static void main(String k[]) {
        Worker calculator = new Worker();
        System.out.println("Addition of two numbers is: " + calculator.addNumbers(10, 20));
        System.out.println("Subtraction of two numbers is: " + calculator.subtractNumbers(10, 20));
        System.out.println("Multiplication of two numbers is: " + calculator.multiplyNumbers(10, 20));
        System.out.println("Division of two numbers: " + calculator.divideNumbers(10, 20));
    }
}

class Worker {
    int addNumbers(int i, int j) {
        return i + j;
    }

    int subtractNumbers(int i, int j) {
        return i - j;
    }

    int multiplyNumbers(int i, int j) {
        return i * j;
    }

    float divideNumbers(int i, int j) throws ArithmeticException {
        if (j != 0) {
            return i / j;
        } else {
            throw new ArithmeticException("Cannot Divide by Zero!");
        }
    }
}
