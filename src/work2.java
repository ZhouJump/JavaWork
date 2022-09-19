public class work2
{
    public static void main(String args[])
    {
        int j = 10;
        for (int i = 0; i < 10; i++)
        {
            for (int k = j; k > 0; k--)
            {
                System.out.print("*");
            }
            System.out.print("\n");
            j =j-1;
        }
    }
}
