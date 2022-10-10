public class work3 {
    public static void main(String args[])
    {
        int swap = 0;
        int []num={10,78,12,15,46,47,2,10};
        for (int i = 0; i < 7; i++)
        {
            for (int j = 0; j < 7; j++)
            {
                if (num[j] <num [j+1])
                {
                    swap = num[j];
                    num[j] = num[j+1];
                    num[j+1] = swap;
                }

            }
        }
        for (int l = 0; l < 7; l++)
        {
           System.out.println(num[l]+" ");
        }


    }
}
