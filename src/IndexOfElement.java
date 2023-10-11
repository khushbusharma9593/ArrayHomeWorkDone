import java.util.Arrays;
import java.util.Scanner;

public class IndexOfElement {
    public static boolean verify;

    public static int indexofelement(int value, int[] a) {
        int index = 0;//the index we return
        for (int i = 0; i < a.length; i++) {
            if (a[i] == value) {
                index = i;//if value exists, assign i to the variable index
                verify = true;
            }
        }return (index);
    }

        public static void main (String[]args)
        {   //get the array's length as an input from the user
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the array's length ");
            int array_length = scanner.nextInt();

            int array[] = new int[array_length];//create the array
            System.out.println("set the array elements");

            for (int i = 0; i < array_length; i++) {
                array[i] = scanner.nextInt();

            }
            System.out.println("My array elements are :" + Arrays.toString(array));

            System.out.println("what elements you want to check its index?");//set the value you want to check its index
            int element = scanner.nextInt();

            //send element and array to indexofelement
            int index = indexofelement(element, array);

            //check weather or not the send value corresponds to any of the array element
            if (verify) {
                System.out.println("the index of " + element + " is " + index);

            } else {
                System.out.println("Soory! this value doesn't exists");
            }
        }

}




