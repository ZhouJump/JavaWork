
public class work1
{
    public static void main(String args[])
    {
        int chen = 0;
        for (int i = 0; i < 5; i++)
        {
            chen =chen +2;
            int sum = 1;
            for (int j = 1; j <= chen; j++)
                sum = sum * j;
            System.out.println(chen+"的阶乘是"+sum);
        }
    }
}
