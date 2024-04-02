package loop;

import java.util.Scanner;

public class PrintEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int temp = 2;
        while (temp > 0) {
            for (int i = 1; i <= n; i++) {
                if (temp == 2) {
                    if (i % 2 != 0) {
                        System.out.println("Odd Number : " + i);
                    }
                } else {
                    if (i % 2 == 0) {
                        System.out.println("Even Number : " + i);
                    }
                }
            }
            temp--;
        }
        // System.out.println();
        // for (int i = 1; i <= n; i++) {
        // if (i % 2 == 0) {
        // System.out.println("Even Number : " + i);
        // }
        // }
    }
}
