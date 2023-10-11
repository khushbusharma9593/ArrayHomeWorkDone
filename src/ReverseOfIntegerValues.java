import java.util.Arrays;
import java.util.Scanner;

public class ReverseOfIntegerValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n = scanner.nextInt();

        int arr[] = new int[n];// Declare an array
        System.out.println("Enter an array value");

        for (int i = 0; i < n; i++)//Input array values
        {
            arr[i] = scanner.nextInt();
        }

        int start = 0;//variable declared
        int end = n - 1;
        int temp;

        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println("Printing an array after reverse");

        for (int j = 0; j < n; j++) {
            System.out.println(arr[j]);

        }


    }
}
