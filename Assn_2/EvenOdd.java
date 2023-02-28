import java.util.Scanner;

// In this assignment we have collected a list of numbers from the user and segregate it into two arrays. One for odd numbers and one for even numbers.

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] even = new int[100];
        int[] odd = new int[100];
        int evenCount = 0, oddCount = 0;

        System.out.print("Enter numbers (Enter -1 to stop): ");
        int num = input.nextInt();
        while (num != -1) {
            if (checkNum(num) == 1) {
                even[evenCount] = num;
                evenCount++;
            } else {
                odd[oddCount] = num;
                oddCount++;
            }
            num = input.nextInt();
        }

        System.out.print("Even numbers: ");
        display(even, evenCount);

        System.out.print("Odd numbers: ");
        display(odd, oddCount);
        input.close();
    }

    static int checkNum(int num) {
        // 1 for even, 0 for odd.
        if (num % 2 == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    static void display(int[] arr, int len) {
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
