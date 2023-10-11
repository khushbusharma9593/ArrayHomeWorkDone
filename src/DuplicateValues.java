import java.util.Scanner;

public class DuplicateValues {
    public static void main(String[] args)
    {
        int arr[] = new int[]{1, 2, 3, 4, 2, 8};//Initialize array

        //Search for duplicate elements
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr[i] == arr[j])
                {
                    System.out.println("Found the duplicate element: "+arr[i]);
                }


            }


        }
    }
}
