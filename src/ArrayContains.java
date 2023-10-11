public class ArrayContains
{
    public static void main(String[] args)
    { int num[] = {5,6,7,8,9}; //variable declared
        int toFind = 8; //number to be found is stored in toFind
        boolean found = false;

        //we use a for-each loop to iterate through all elements of num and check individually if toFind is equal to n or not.
        for (int n : num)
        { if (n == toFind)
        {//we set found to true and break from the loop. If not, we move to the next iteration.
            found = true;
            break;
        }

        }  if(found)
        {
        System.out.println( toFind+" is found");

    }else
        System.out.println( toFind+ " is not found");

    }
}
