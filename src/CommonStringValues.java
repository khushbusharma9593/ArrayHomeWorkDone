public class CommonStringValues
{
    public static void main(String[] args) {
        String[] str1 = {"One","Two", "Three","Four","Five"};
        String[] str2 = {"Six","Seven","Three","Nine","Ten"};

        for (int i = 0; i < str1.length ; i++)
        {
            for (int j = 0; j < str2.length ; j++)
            { if (str1[i]==str2[j])
            {
                System.out.println("Found the common elements:"+str1[i]);
            }

            }

        }
    }
}
