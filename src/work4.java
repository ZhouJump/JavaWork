public class work4 {
    public static void main(String[] args) {
        {
            int i, j, k;
            for (i = 1; i < 99999; i++) {
                int sum = 0;
                for (j = 1; j < i; j++) {
                    if (i % j == 0) {
                        sum += j;
                    }
                }
                if (sum == i) {
                    System.out.println(i+"是完数");
                }
            }
        }
    }
}

