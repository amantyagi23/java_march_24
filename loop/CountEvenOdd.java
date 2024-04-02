package loop;

import java.util.Scanner;

public class CountEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int evenCount = 0;
        int oddCount = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even Count is : " + evenCount);
        System.out.println("Odd Count is : " + oddCount);
        sc.close();
    }
}
