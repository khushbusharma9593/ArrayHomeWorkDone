import java.util.Arrays;

public class EqualityOfArrays {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5}; // Initializing the first array

        int arr2[] = {1, 2, 3, 4, 5}; // Initializing the second array

        // Arrays.equals(arr1, arr2) function is used to check
        // whether two arrays are equal or not
        // store the status
        boolean status = Arrays.equals(arr1, arr2);

        // condition to check whether the status is true or false

        if (status == true) {
            System.out.println("Arrays are Equal"); //Print the status

        } else {
            System.out.println("Arrays are Not Equal"); //Print the status

        }


    }
}
