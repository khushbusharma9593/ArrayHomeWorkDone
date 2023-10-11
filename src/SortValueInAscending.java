import java.util.Scanner;

public class SortValueInAscending
{
    public static void main(String[] args){

        int arr[] = {12,10,5,2,50};    // Initializing custom array elements

        System.out.print("Elements of Original Array:  ");  // Displaying elements of original array

        // Iterating using for loops
        for (int i = 0; i < arr.length ; i++)
            System.out.print(arr[i]+ "   ");

        int temp = 0;//variable declared
        // Sort the array 'arr' elements in ascending order
        // using nested for loops
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i+1 ; j < arr.length; j++)
            { if (arr[j]< arr[i]){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            }
        }

        System.out.print("\nElements of array sorted in ascending order:  ");  // Displaying elements of array after sorting

        for (int i = 0; i < arr.length ; i++)
        {
            System.out.print(arr[i]+ "   ");

        }
    }
}
