public class SumValues
{
    // Java Program to find sum of elements in a given array
    public static void main(String[] args)
    {   int array[]= {10,20,30,40};//Variable declared
        int sum = 0; //initialize sum

        for (int i = 0; i < array.length ; i++)// Iterate through all elements and add them to sum

        { sum = sum+array[i];

        }
        System.out.println("Sum of given array is "+sum);

    }
}
