package Assn_8;

public class Main {
    public static void main(String[] args) throws OutOfRangeException {
        System.out.println("Main Initialized");
        try {
            // int num = Integer.parseInt(args[0]);
            System.out.println(calculateFactorial(10));
        } catch (NumberFormatException n) {
            System.out.println("Incorrect Number Format");
        } catch (OutOfRangeException o) {
            System.out.println("Number is out of range");
        }
    }

    public static int calculateFactorial(int number) throws OutOfRangeException {
        if (number > 0 && number < 20) {
            int fact = 1;
            for (int i = 2; i <= number; i++) {
                fact *= i;
            }
            return fact;
        } else {
            throw new OutOfRangeException("Number is out of Range");
        }
    }
}
