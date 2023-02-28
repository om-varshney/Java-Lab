import java.util.Scanner;

// In this program we take one array from the user and find out the location at which the distance between consequetive elements is minimum. If there are multiple such occurences we return the first.

public class MinDistanceIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];
        int count = 0;

        System.out.print("Enter numbers (Enter -1 to stop): ");
        int num = input.nextInt();
        while (num != -1) {
            numbers[count] = num;
            count++;
            num = input.nextInt();
        }
        
        System.out.println("Minimum adjacent Distance at location: ");
        System.out.println(calculateMinDistance(numbers, count));
        input.close();
    }

    static int calculateMinDistance(int[] arr, int len) {
        int[] distances = new int[9];
        int minIdx = 0;
        for (int i = 0; i < len - 1; i++) {
            distances[i] = arr[i + 1] - arr[i];
        }

        for (int j = 0; j < len - 2; j++) {
            if (distances[j] < distances[minIdx]) {
                minIdx = j;
            }
        }
        return minIdx;
    }
}
