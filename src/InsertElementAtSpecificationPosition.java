import java.util.Scanner;

public class InsertElementAtSpecificationPosition
{
    public static void main(String[] args)
    { int[] array=new int[5];//5 is index of array
        System.out.println("Enter the elements");//print the line and then user can be entered the value
        Scanner scanner=new Scanner(System.in);//object created of scanner

        for (int i = 0; i < array.length-1 ; i++)//using for loop method to stop after elements as 0
        { array[i]=scanner.nextInt();

        }
        System.out.println("Printing elements before insert");

        for(int i:array){
            System.out.println(i);
        }
        System.out.println("Enter the location at which we want to insert ");
        int location=scanner.nextInt();//variable created to use in method

        System.out.println("Enter the value at which we want to insert ");
        int value=scanner.nextInt();//variable created

        for (int i= array.length-1; i>location ; i--)
        { array[i]=array[i-1];
        }
        array[location]=value;

        for (int i:array){
            System.out.println(i);
        }






    }

}
