import java.util.Scanner;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FibFact {
    public static void main(String args[]) throws IOException {
        Scanner input = new Scanner(System.in);
        int choice;
        while (true) {
            printMenu();
            System.out.println("Enter Choice: ");
            choice = input.nextInt();
            if (choice == 1) {
                factorialScanner();
            } else if (choice == 2) {
                factorialBufferedReader();
            } else if (choice == 3) {
                fibonacciDataInputStream();
            } else if (choice == 4) {
                nFibonacci(Integer.parseInt(args[0]));
            }
        }        
    }

    static void printMenu() {
        System.out.println("1. Calculate factorial using Scanner.");
        System.out.println("2. Calculate factorial using BufferedReader.");
        System.out.println("3. Calculate fibonacci using DataInputStream.");
        System.out.println("4. Calculate fibonacci using Command Line Arguments.");
    }

    static void factorialScanner() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value of x: ");
        int num = input.nextInt();
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + num + " is: " + fact);
    }

    static void factorialBufferedReader() throws IOException {
        int num = 0;
        System.out.println("Enter value of x: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            num = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + num + " is: " + fact);
    }

    static void fibonacciDataInputStream() throws IOException {
            int num = 0;
            System.out.println("Enter value of x: ");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            num = Integer.parseInt(reader.readLine());
            int a = 0, b = 1, c;
            System.out.print(a + " " + b);
            for(int i = 2; i < num; i++) {    
                c=a + b;    
                System.out.print(" " + c);    
                a = b;    
                b = c;    
            }    
            System.out.print("\n");
    }
    
    static void nFibonacci(int n) {
        int a = 0, b = 1, c;
        System.out.print(a + " " + b);
        for(int i = 2; i < n; i++) {    
            c=a + b;    
            System.out.print(" " + c);    
            a = b;    
            b = c;    
        }    
        System.out.print("\n");
    }
}
