package JavaTutorial.Java_Class_Live;

import java.util.*;
import java.io.*;

class AgeException extends Exception {
    public AgeException(String errorMessage) {
        super(errorMessage);
    }
}

public class CustomExceptions {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Age: ");
            int age = sc.nextInt();
            if (age < 0) {
                throw new AgeException("Invalid age");
            } else if (age < 18) {
                throw new AgeException("Age should be greater than 18");
            } else {
                System.out.println("Valid age");
            }
        } catch (AgeException e) {
            System.out.println(e.getMessage());
        }
    }
}