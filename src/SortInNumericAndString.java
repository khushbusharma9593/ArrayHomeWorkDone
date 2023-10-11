import java.util.Arrays;

public class SortInNumericAndString
{
    public static void main(String[] args)
    { int[] array1= {12,56,89,25,8,5,66};
        String[] array2= {"Maths", "Dog", "Apple", "Car"};
        System.out.println("Original numeric array:"+ Arrays.toString(array1));
        Arrays.sort(array1);
        System.out.println("Sorted numeric array:" + Arrays.toString(array1));

        System.out.println("Original String array:"+ Arrays.toString(array2));
        Arrays.sort(array2);
        System.out.println("Sorted String array:" + Arrays.toString(array2));

    }
}
