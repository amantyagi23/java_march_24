package array;

public class EvenOddSum {
    public static void main(String[] args) {
        int n = 10;
        int sum[] = new int[2];
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum[0] = sum[0] + i;
            } else {
                sum[1] = sum[1] + i;
            }
        }

        for (int i = 0; i < sum.length; i++) {
            System.out.println(sum[i]);
        }
    }
}
