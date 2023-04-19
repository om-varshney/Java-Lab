import java.util.Scanner;
import java.util.*;

// In this program we are converting a user inputted array to ArrayList in Java

public class ArrayConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];
        int count = 1;
        System.out.print("Enter 10 numbers");
        int num = input.nextInt();
        while (count < 10) {
            numbers[count] = num;
            count++;
            num = input.nextInt();
        }
        convertToArrayList(numbers);
        input.close();
    }

    static void convertToArrayList(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int l = 0; l < 10; l++) {
            list.add(arr[l]);
        }
        System.out.println(list);
    }
}
