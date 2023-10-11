import java.util.Arrays;

public class ElementsPresentOrNot
{
    public static void main(String[] args)
    {
        int a[] = {10, 50, 40, 55, 20};  // Get the array

        int search_ele = 40;  // Get the value to be checked

        boolean flag = true;

        System.out.println("Array: "+ Arrays.toString(a));   // Print the array


        for (int i = 0; i < a.length; i++)
        {
            // System.out.println(a[i]);
            // check if the specified element is present in the array or not

            if (search_ele == a[i])
            {
                System.out.println("Element present at:" + i +" and it is "+ flag);  // Print the result
                flag = true;
                break;
            }

        }
        if (flag == false) {
            System.out.println("Element NOT present at:"); //Print the result
        }
    }
}
