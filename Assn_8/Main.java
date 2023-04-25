/*
Main package demonstrates the working of OutOfRangeException and NOMATCHEXCP
*/

package Assn_8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main Initialized");
        try {
            System.out.println("Using CLA");
            for (String arg : args) {
                try {
                    int num = Integer.parseInt(arg);
                    System.out.println(calculateFactorial(num));
                } catch (NumberFormatException n) {
                    System.out.println("Incorrect Number Format");
                } catch (OutOfRangeException o) {
                    System.out.println("Number is out of range");
                }
            }
            System.out.println("Calling from Main");
            System.out.println(calculateFactorial(5));
            System.out.println("Country Exception Demo");
            Scanner sc = new Scanner(System.in);
            String country = sc.nextLine();
            testCountry(country);
        } catch (NOMATCHEXCP e) {
            System.out.println(e.toString());
        } catch (OutOfRangeException e) {
            throw new RuntimeException(e);
        }
    }

    public static int calculateFactorial(int number) throws OutOfRangeException {
        if (number > 0 && number < 15) {
            int fact = 1;
            for (int i = 2; i <= number; i++) {
                fact *= i;
            }
            return fact;
        } else {
            throw new OutOfRangeException("Number is out of Range");
        }
    }

    public static void testCountry(String country) throws NOMATCHEXCP {
        if (country.equals("India")) {
            System.out.println("Correct Country Entered");
        } else {
            throw new NOMATCHEXCP("Wrong Country", country);
        }
    }
}
